import java.util.Scanner;

public class Bai2_QuyDoiTienTe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TY_GIA_USD = 23500;
        final int TY_GIA_EUR = 27000;

        System.out.println("1. USD -> VND");
        System.out.println("2. EUR -> VND");
        System.out.print("Chon: ");
        int choice = sc.nextInt();

        System.out.print("Nhap so tien: ");
        int soTien = sc.nextInt();   

        int vnd;

        if (choice == 1) {
            vnd = soTien * TY_GIA_USD;
        } else if (choice == 2) {
            vnd = soTien * TY_GIA_EUR;
        } else {
            System.out.println("Lua chon khong hop le!");
            sc.close();
            return;
        }

        System.out.println("So tien quy doi: " + vnd + " VND");

        sc.close();
    }
}
