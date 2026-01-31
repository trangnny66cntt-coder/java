import java.util.Scanner;
public class Bai1_Tinhluongtheogio {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap gio lam: ");
	        double soGioLam = sc.nextDouble();

	 	        System.out.print("Nhap luong theo gio: ");
	        double luongTheoGio = sc.nextDouble();

	        double tongLuong;

	         if (soGioLam <= 40) {
	            tongLuong = soGioLam * luongTheoGio;
	        } else {
	            double gioThuong = 40;
	            double gioTangCa = soGioLam - 40;
	            tongLuong = gioThuong * luongTheoGio 
	                      + gioTangCa * luongTheoGio * 1.5;
	        }

	       System.out.println("Tong luong: " + tongLuong);

	        sc.close();

	}

}
