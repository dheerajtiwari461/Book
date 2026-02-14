package Lesson15;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    SimpleCalculator cal;
    Boolean action = true;
    int a = 0, b = 0;

    public void run() {
        do{
            
             System.out.println("\n===== Simple Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

             int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                action = false;
            } else if (choice >= 1 && choice <= 4) {

                // Get operands
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                try {
                    int result = 0;

                    switch (choice) {
                        case 1:
                            result = SimpleCalculator.add(num1, num2);
                            break;
                        case 2:
                            result = SimpleCalculator.sub(num1, num2);
                            break;
                        case 3:
                            result = SimpleCalculator.mul(num1, num2);
                            break;
                        case 4:
                            result = SimpleCalculator.div(num1, num2);
                            break;
                    }
                    System.out.println("Result: " + result);
            }catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                } else {
                System.out.println("Invalid option. Please try again.");
            }
        
            
        }while(action);
        sc.close();
    }
}
