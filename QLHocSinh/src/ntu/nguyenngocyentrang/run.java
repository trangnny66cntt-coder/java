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
		
		System.out.print("Mời nhập tên học sinh thứ 3: ");
		String tenHS3 = banPhim.nextLine();
		hs3.setTenHS(tenHS3);
		
		System.out.print("Mời nhập tuổi học sinh thứ 3: ");
		Short tuoiHS3 = banPhim.nextShort();
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Mời nhập lớp học sinh thứ 3: ");
		String lopHS3 = banPhim.nextLine();
		hs3.setLopHS(lopHS3);
		
		System.out.print(hs3.toString());
		
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		
		int N = 3;
		for (int i = 0; i<N;i++);{
        HocSinh hsi = new HocSinh();
        
        System.out.print("Mời nhập tên học sinh thứ: " +i);
    	String tenHSi = banPhim.nextLine();
		hsi.setTenHS(tenHSi);
		
		System.out.print("Mời nhập tuổi học sinh thứ: " + i );
		Short tuoiHSi = banPhim.nextShort();
		hsi.setTuoiHS(tuoiHSi);
		
		System.out.print("Mời nhập lớp học sinh thứ : " + i);
		String lopHSi = banPhim.nextLine();
		hsi.setLopHS(lopHSi);
		
		// dua vao danh sach
		dsHocSinh.add(hsi);
		
	}
	//in ra
	for (int i = 0; i<N;i++) {
		System.out.println(dsHocSinh.get(i).toString());
	}
	HocSinh hsThem = new HocSinh();
	System.out.print("Mời nhập tên học sinh thêm: ");
	String tenHSThem = banPhim.nextLine();
	hsThem.setTenHS(tenHSThem);
	
	System.out.print("Mời nhập tuổi học sinh thêm: ");
	Short tuoiHSThem = banPhim.nextShort();
	hsThem.setTuoiHS(tuoiHSThem);
	
	System.out.print("Mời nhập lớp học sinh thêm: ");
	String lopHSThem = banPhim.nextLine();
	hs3.setLopHS(lopHSThem);

	dsHocSinh.add(hsThem);
	
	for(int i=0; i<N; i++) {
		System.out.println(dsHocSinh.get(i).toString());
	}
	
	// 5a
	for(int i=0; i<N; i++) {
		HocSinh hsTim = dsHocSinh.get(i);
		if(hsTim.getTenHS()=="Hoa") {
			dsHocSinh.remove(hsTim);
			break;
		}
	}
	//in ra
	for(int i=0; i<N; i++) {
		System.out.println(dsHocSinh.get(i).toString());
	}
 }
}
