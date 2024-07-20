import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of your student");
        String name=sc.nextLine();
        System.out.println("Enter the section of your student");
        String section=sc.nextLine();
        System.out.println("Enter marks of the student");
        double marks=sc.nextDouble();

        System.out.println("Name: "+name);
        System.out.println("Section: "+section);
        System.out.println("Marks: "+marks);

        sc.close();
    }
}