import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number : ");
        double a1 = scanner.nextDouble();
        System.out.println("write the quantity :  ");
        double  n = scanner.nextDouble();
        System.out.println(" write the remainder : ");
        double d = scanner.nextDouble();
        double Sum =a1;
        if (n>0&&n%1==0)
        {
            for (int i=0; i<n; i++) {
                System.out.print(Sum + " , ");
                Sum=Sum+d;
            }
        }
        else {
            System.out.println("youre quantity is wrong");
        }

    }
}