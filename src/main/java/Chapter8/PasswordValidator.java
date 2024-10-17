package Chapter8;

import java.util.Scanner;

public class PasswordValidator {

    public static boolean validatePassword(String password, String username, String oldPassword) {

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }

        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

        if (password.toLowerCase().contains(username.toLowerCase())) {
            System.out.println("Password must not contain the username.");
            return false;
        }
        if (password.equals(oldPassword)) {
            System.out.println("Password must not be the same as the old password.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your old password: ");
        String oldPassword = scanner.nextLine();

        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();

        if (validatePassword(newPassword, username, oldPassword)) {
            System.out.println("Password has been successfully changed.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }

}
