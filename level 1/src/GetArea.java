import java.util.Scanner;

public class GetArea {

    public void areaRectangle(int len, int brdth){
        int area = len *brdth;
        System.out.println("Area of rectangle with length " +len+" and breadth " +brdth+" is "+area);
    }
    public void areaTriangle(int height, int base){
        float area = (float) (0.5 * base * height);
        System.out.println("Area of triangle with height "+height+" and base "+base+" is "+area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = scanner.nextInt();
        GetArea a1 = new GetArea();
        a1.areaRectangle(length,breadth);
        a1.areaTriangle(length,breadth);


    }
}
