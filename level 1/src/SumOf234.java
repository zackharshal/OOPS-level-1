import java.util.Scanner;

public class SumOf234 {
    public static void sum(int num1, int num2){
        int sum2 = num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum2);
    }
    public static void sum(int num1, int num2, int num3){
        int sum3 = num1+num2+num3;
        System.out.println("The sum of "+num1+", "+num2+" and "+num3+" is "+sum3);
    }
    public static void sum(int num1, int num2, int num3, int num4){
        int sum4 = num1+num2+num3+num4;
        System.out.println("The sum of "+num1+", "+num2+", "+num3+" and "+num4+" is "+sum4);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter the forth number: ");
        int num4 = scanner.nextInt();
        sum(num1,num2);
        sum(num1,num2,num3);
        sum(num1,num2,num3,num4);
    }
}
