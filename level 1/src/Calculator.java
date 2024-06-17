import java.util.Scanner;

public class Calculator {
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = add(num1,num2);
        System.out.println("The sum of "+ num1+ " and " + num2 + " is " + sum);
    }
    public static void main(String[] args) {
        input();
    }
}
