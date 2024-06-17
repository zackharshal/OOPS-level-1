import java.util.Scanner;

public class Area {

    public void area(int length, int breadth){
        int areaOfRectangle = length * breadth;
        System.out.println("Area of rectangle with length "+length+" and breadth "+breadth+" is " + areaOfRectangle);
    }
    public void area(int side){
        int areaOfSquare = side * side;
        System.out.println("Area of square with sides "+side+" is "+areaOfSquare);
    }
    public void area(float radius){
        float areaOfCircle = (float) (Math.PI * radius * radius);
        System.out.printf("Area of circle with radius %.2f is %.2f",radius,areaOfCircle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = scanner.nextInt();
        System.out.println("Enter the breadth: ");
        int brdth = scanner.nextInt();
        System.out.println("Enter side of a square: ");
        int side = scanner.nextInt();
        System.out.println("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        Area a1 = new Area();
        a1.area(len,brdth);
        a1.area(side);
        a1.area(radius);
    }
}
