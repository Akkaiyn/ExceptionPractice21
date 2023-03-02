package firstTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your age: ");
        try {
            int age = scanner.nextInt();
            if (age <= 0){
                throw new MyException("Human's age can't be zero or nagative");
            }
            System.out.println("Passed");
        } catch (MyException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Please enter your email");
        try{
        String email = scanner1.nextLine();
        if (!email.contains("@")){
            throw new MyException("Email must have simbol '@'.");
        }
            System.out.println("Passed");}

        catch (MyException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Please enter your password: ");
        try {
            String password = scanner1.nextLine();
            if (password.length() < 7) {
                throw new MyException("Password needs to have 7 or more symbol");
            }
            System.out.println("Passed");
        } catch (MyException m){
            System.out.println(m.getMessage());
        }
        }
    }
