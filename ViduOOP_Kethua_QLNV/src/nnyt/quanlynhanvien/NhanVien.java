package nnyt.quanlynhanvien;

public class NhanVien {
// thuộc tính 
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	// hàm tạo
//	public NhanVien(){
		
//	}
//	public NhanVien(String maNhanVien, String tenNhanVien, double luognCoBan) {
//		this.maNV = maNhanVien;
//		this.hoTen = tenNhanVien;
//		this.luongCoBan = luongCoBan; 
	//}
	
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
public NhanVien() {
	super();
}
public double tinhLuong() {
	return luongCoBan;
}
@Override
public String toString() {
	return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
}
public void hienThiThongTin() {
	System.out.println("Mã NV: " + maNV);
	System.out.println("Họ tên: " + hoTen);
	System.out.println("Lương cơ Bản: " + luongCoBan);
}
}
