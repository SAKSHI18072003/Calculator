// To create a basic calculator

import java.util.Scanner;
class calculator
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
            System.out.print("Enter operation: ");
            int opr=sc.nextInt();
            System.out.print("Enter two numbers: ");
            double num1=sc.nextDouble();
            double num2=sc.nextDouble();
            //It checks the operation if it is equal to given operator then enters in case
            switch(opr)
            {
                case 1:
                    double sum=num1+num2;
                    System.out.println("Addition of " +num1 + " and " +num2 + " is " +sum);
                    break;
                case 2:
                    double sub=num1-num2;
                    System.out.println("Subtraction of " +num1 + " and " +num2 + " is " +sub);
                    break;
                case 3:
                    double mul=num1*num2;
                    System.out.println("Multiplication of " +num1 + " and " +num2 + " is " +mul);
                    break;
                case 4:
                    double div=num1/num2;
                    System.out.println("Division of " +num1 + " and " +num2 + " is " +div);
                    break;
                default:
                    System.out.println("Invalid input");
                
            }
        }


    }
}