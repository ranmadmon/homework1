import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int n1=0;
            int n2=1;
            int Sum=0;
            boolean InOrNot=false;
            Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = scanner.nextInt();
        while (n1+n2<number)
        {
            Sum=n1+n2;
            n1=n2;
            n2=Sum;
            if (n2+n1==number)
            {
               InOrNot=true;
            }
        }
        if (InOrNot==true)
            System.out.println("the number in fibonachi");
        else
            System.out.println("the number is not in fibonachi");



    }
}