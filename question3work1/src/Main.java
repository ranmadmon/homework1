import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number;
        do {
            System.out.println(" Enter a number");
            number= scanner.nextInt();
        }while (number%2==0||number<=3);
        int number2=number/2;
        for (int i=1;i<=number;i=i+2)
        {
            String a1="";
            for (int k =0; k<number2;k++)
            {
                a1=a1+" ";
            }
            System.out.print(a1);
            for (int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            number2--;
        }
        String a2=" ";
        for (int i=number-2;i>=1;i=i-2)
        {
            System.out.print(a2);
            for (int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            a2=a2+ " ";
        }
    }
}