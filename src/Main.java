import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  vnd = 23000;
        double usd;

        System.out.print("Nhập số tiền USD cần đổi: ");
        usd = scanner.nextDouble();

        double thanhtien;
        thanhtien = usd * vnd ;
        System.out.printf("Giá tiền VNĐ là: %.0f", thanhtien);
        System.out.print(" VND");
    }
}