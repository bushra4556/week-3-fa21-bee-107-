import java.util.Scanner;

class UserInfo {

    
    private static String username = "Bushra4556";
    private static String password = "password4556";

    public static boolean checkCredentials(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (checkCredentials(inputUsername, inputPassword)) {
            System.out.println("Credentials matched! Access granted.");
           
        } else {
            System.out.println("Invalid credentials. Access denied.");
        }

        // Close the scanner
        scanner.close();
    }
}
