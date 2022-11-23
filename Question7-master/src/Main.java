import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int number = 0; number < 1000; number++) {
            int uniteNumber = 0;
            int tensNumber = 0;
            int hundredsNumber = 0;
            for (int i = number; i % 10 != 0; i--) {
                uniteNumber = uniteNumber + 1;
            }
            int newNumber1 = number - uniteNumber;
            int newNumber2 = newNumber1 / 10;
            for (int u = newNumber2; u % 10 != 0; u--) {
                tensNumber = tensNumber + 1;
            }
            int newNumber3 = newNumber2 - tensNumber;
            hundredsNumber = newNumber3 / 10;
            int p = 0;
            if (hundredsNumber != 0) p = 3;
            else if (tensNumber != 0) p = 2;
            else if (uniteNumber != 0) p = 1;
            double sum = Math.pow(hundredsNumber, p) + Math.pow(tensNumber, p) + Math.pow(uniteNumber, p);
            if (sum == number) System.out.println("We found a narcicist number: " + number);
        }
    }


}
