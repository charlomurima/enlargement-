import java.util.Scanner;

public class Enlargement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the scale factor: ");
    double scale = sc.nextDouble();

    System.out.print("Enter the original length: ");
    double length = sc.nextDouble();

    double newLength = length * scale;

    System.out.println("Original length: " + length);
    System.out.println("New length: " + newLength);
  }
}
