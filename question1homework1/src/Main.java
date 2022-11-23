import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        int c;
        double sum;
        System.out.println(" enter a : ");
        a = scanner.nextInt();
        System.out.println(" enter b : ");
        b = scanner.nextInt();
        System.out.println(" enter c : ");
        c = scanner.nextInt();
        int ac = a * c;
        double x1 = (-b + (Math.sqrt(b * b - 4 * ac))) / (2 * a);
        double x2 = (-b - (Math.sqrt(b * b - 4 * ac))) / (2 * a);
        if ((b * b - 4 * ac) < 0) {
            System.out.println("There is no answer");
        } else if (x1 != x2) {
            System.out.println("x1 :  " + x1 + "    x2 :   " + x2);
        } else {
            System.out.println("the answer is :  " + x1);
        }

    }
}