import java.util.Scanner;

public class NestingMethods {
    public static void volume(int length, int breadth,int height){
        int volume = length * breadth * height;
        System.out.println("The volume of cuboid is " + volume);
        area(length,breadth,height);
    }
    public static void area(int length, int breadth, int height){
        int area = 2*(length*breadth + breadth*height + length*height);
        System.out.println("The area of cuboid is " + area);
        perimeter(length,breadth,height);
    }
    public static void perimeter(int length, int breadth, int height){
        int perimeter = 4*(length + breadth + height);
        System.out.println("The perimeter of cuboid is " + perimeter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the cuboid: ");
        int breadth = scanner.nextInt();
        System.out.println("Enter the height of the cuboid: ");
        int height = scanner.nextInt();
        volume(length,breadth,height);
    }
}
