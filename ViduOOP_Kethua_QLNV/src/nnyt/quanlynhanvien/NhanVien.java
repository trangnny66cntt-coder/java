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
	String chuoiXuat= "";
	chuoiXuat = chuoiXuat + "Mã NV: " + this.maNV;
	chuoiXuat = chuoiXuat + "Họ Tên: " + this.hoTen;
	chuoiXuat = chuoiXuat + "Lương cơ bản: " + this.luongCoBan;
	return chuoiXuat;
}
public void hienThiThongTin() {
	System.out.println("Mã NV: " + maNV);
	System.out.println("Họ tên: " + hoTen);
	System.out.println("Lương cơ Bản: " + luongCoBan);
}
//cac getter/setter
public String getMaNV() {
	return maNV;
}
public void setMaNV(String maNV) {
	this.maNV = maNV;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public double getLuongCoBan() {
	return luongCoBan;
}
public void setLuongCoBan(double luongCoBan) {
	this.luongCoBan = luongCoBan;
}

}
