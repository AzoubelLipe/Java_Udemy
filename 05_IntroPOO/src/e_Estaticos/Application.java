
package e_Estaticos;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Application {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("\nCircumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI: %.2f\n\n", Calculator.PI);


        sc.close();


    }
}
