import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number");
        double num= scanner.nextDouble();
        int counter=0;
        while (num/10!=0&&num!=0)
        {
            double n=num%10;
            counter+=n;
            num=num/10;
        }
        System.out.println(counter);


        }
}