import java.util.Scanner;

public class Java {
    void Area(int r ){
        double c=(float)Math.PI*r*r;
        System.out.println("Area of circle= "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        Java obj = new Java();
        obj.Area(r);
    }
}