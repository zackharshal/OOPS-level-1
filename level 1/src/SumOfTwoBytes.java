import java.util.Scanner;

public class SumOfTwoBytes {
    public static int add(byte b1,byte b2){
        int num1 = (int) b1;
        int num2 = (int) b2;
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first byte number: ");
        byte b1  = scanner.nextByte();
        System.out.println("Enter the second byte number: ");
        byte b2 = scanner.nextByte();
        System.out.println("The sum is " + add(b1,b2));
    }
}
