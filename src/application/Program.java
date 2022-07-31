package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("How many numbers you'll enter? ");
        int n = key.nextInt();

        double[] vect = new double[n];
        double sum = 0;

        System.out.println();

        for (int i = 0; i < n; i++ ){
            System.out.print("Enter the number: ");
            vect[i] = key.nextDouble();
            sum += vect[i];
        }
        System.out.println();
        System.out.print("Values = ");
        for (double d : vect){
            System.out.print(String.format("%.1f", d) + " ");
        }
        System.out.println();
        System.out.println("SUM " + String.format("%.2f", sum));
        System.out.print("Average = " + String.format("%.2f", sum / vect.length));

    }
}
