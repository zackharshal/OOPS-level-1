public class CountNumber {
    private static int count = 0;
    CountNumber(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        CountNumber c1 = new CountNumber();
        CountNumber c2 = new CountNumber();
        CountNumber c3 = new CountNumber();
        CountNumber c4 = new CountNumber();
        System.out.println("The number of objects created are "+ getCount());

    }
}
