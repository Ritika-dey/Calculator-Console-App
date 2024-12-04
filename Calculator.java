import java.util.Scanner;

public class Calculator{
       public Calculator(){
        System.out.println("Calculator started....");
       }

       public void start(){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the operands: ");
       int valA = sc.nextInt();
       int valB = sc.nextInt();

       System.out.println("Choose from following options: 1. Add, 2. Subtract, 3. Multiply, 4. Divide.");
       int operation = sc.nextInt();

       Calculate calc = new Calculate(valA, valB);

       switch(operation){
        case 1:
            int sum = calc.add();
            System.out.println("Sum of " + valA + " and " + valB + " is " + sum);
            break;
        case 2:
            int subtraction = calc.sub();
            System.out.println("Subtraction of " + valA + " and " + valB + " is " + subtraction);
            break;
        case 3:
            int multiplication = calc.multi();
            System.out.println("Multiplication of " + valA + " and " + valB + " is " + multiplication);
            break;
        case 4:
            int division = calc.div();
            System.out.println("Division of " + valA + " and " + valB + " is " + division);
            break;
       }
       }
    }
