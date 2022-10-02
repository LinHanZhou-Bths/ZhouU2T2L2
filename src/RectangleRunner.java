import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();

        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        // write the rest of your program below

        Rectangle rect2 = new Rectangle(rect2Length, rect2Width);
        double rect2area = rect2.calculateArea();
        double rect2volume = rect2.calculateBoxVolume(rect2Height);

        Rectangle rect1 = new Rectangle(rect1Length, rect1Width);
        double rect1area = rect1.calculateArea();
        double rect1volume = rect1.calculateBoxVolume(rect1Height);

        System.out.println("Rectangle 1's Area: " + rect1area + ", Box Volume: " + rect1volume);
        System.out.println("Rectangle 2's Area: " + rect2area + ", Box Volume: " + rect2volume);
    }
}
