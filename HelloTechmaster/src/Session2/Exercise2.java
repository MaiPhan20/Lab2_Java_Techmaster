package Session2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double chieuCao, canNang, chiSoBMI;
        DecimalFormat decimalformat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        canNang = scanner.nextDouble();
        System.out.println("Nhập chiều cao: ");
        chieuCao = scanner.nextDouble();
        chiSoBMI = canNang / (chieuCao * chieuCao);
        System.out.println("Chỉ số BMI = " + decimalformat.format(chiSoBMI));
    }
}
