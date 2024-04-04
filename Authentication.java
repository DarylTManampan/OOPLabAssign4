public class Authentication {
    private static final String validPassword = "password";
    private static final int maximumAttempts = 3;
    private int attempts;
  
    public Authentication (String username) {
        this.attempts = 0;
    }
  
    public void passwordLogIn(String enterPassword) throws MaximumPasswordEntryException, PasswordValidationException {
        while (attempts < maximumAttempts) {
            
            if (enterPassword.equals(validPassword)) {
                System.out.println("\n\t\tYou have successfully logged in.\n");
                return;
            } else {
                attempts++;
                if (attempts == maximumAttempts) {
                    throw new MaximumPasswordEntryException("\n\tYou have exceeded the maximum number of password attempts.\n");
                } else {
                    throw new PasswordValidationException("\n\tInvalid password. Please check your password and try again.\n");
                }
            }
        }
    }
  }
  
  