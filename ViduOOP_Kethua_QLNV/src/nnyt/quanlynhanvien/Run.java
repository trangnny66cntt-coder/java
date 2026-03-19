package nnyt.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		// Test lớp Nhân Viên
		NhanVien nv1 = new NhanVien("001", "Nguyễn Ngọc Yến Trang", 2300000);
		// nv1.hienThiThongTin();
		System.out.println(nv1.toString());
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Võ Thị Thanh Ngân", 2300000, 3, 200000);
		System.out.println(nvVanPhong1.toString());
	//	nvVanPhong1.hienThiThongTin();
	}

}
