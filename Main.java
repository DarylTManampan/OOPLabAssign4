import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
       
        System.out.print("\nEnter username: ");
          String username = sc.nextLine();

          Authentication login = new Authentication(username);

          boolean loggedIn = false;
          while (!loggedIn) {
              System.out.print("\nEnter password: ");
              String password = sc.nextLine();
              System.out.print("------------------------------------------------------------------------------");

              try {
                  login.passwordLogIn(password);
                  loggedIn = true;
              }
              
              catch (MaximumPasswordEntryException e) {
                  System.out.println(e.getMessage());
                  break; 
              } 
              
              catch (PasswordValidationException e) {
                  System.out.println(e.getMessage());
              }
          }
    }
  }
}
