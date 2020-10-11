import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a two digit number:");
    int num1 = scan.nextInt();
    System.out.println("Here are the digits!: ");
    System.out.println(num1 / 10);
    System.out.println(num1 % 10);
    }
}