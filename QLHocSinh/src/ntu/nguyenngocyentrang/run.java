package ntu.nguyenngocyentrang;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		HocSinh hs1 = new HocSinh();
		String tenHS1 = "Nguyễn Văn An";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 18;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "12C-10";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Trần Ngọc Tâm", (short)10,"12C");
		
		System.out.print(hs1.toString());
		//System.out.print(hs2.toString());
		System.out.print("Tên của HS 2 là: " + hs2.getTenHS());
		System.out.print("Tuổi của HS 2 là: " + hs2.getTuoiHS());
		System.out.print("Lớp của HS 2 là: " + hs2.getLopHS());
		
		//================NHẬP DỮ LIỆU TỪ BÀN PHÍM
		Scanner banPhim = new Scanner(System.in);
		
		HocSinh hs3 = new HocSinh();
		
		System.out.print("Mời nhập tuổi học sinh thứ 3: ");
		String tuoiHS3 = banPhim.nextLine();
		hs3.setTenHS(tuoiHS3);
		
		System.out.print("Mời nhập lớp học sinh thứ 3: ");
		String lopHS3 = banPhim.nextLine();
		hs3.setTenHS(lopHS3);
	}

}
