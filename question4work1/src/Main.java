import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        for (int j=2; j<=number; j++)
        {
            int counter=0;
            for (int i=2; i<=j;i++)
            {
                if (j%i==0)
                {
                    counter++;
                }
            }
            if (counter==1)
            {
                System.out.print(j + " ");
            }
        }
    }
}