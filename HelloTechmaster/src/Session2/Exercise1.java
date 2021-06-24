package Session2;

import java.lang.Math;

public class Exercise1 {
    public static void main(String[] args) {
        double a = 4.0;
        double b = 3.0;
        // System.out.println("Cạnh huyền của tam giác có hai cạnh góc vuông "+a+" và "+b+" là: "+ Math.hypot(a,b));
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Cạnh huyền của tam giác có hai cạnh góc vuông " + a + " và " + b + " là: " + c);
        System.out.println("\t\t\n--------------------------------");
    }
}
