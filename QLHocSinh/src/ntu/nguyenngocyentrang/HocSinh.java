package ntu.nguyenngocyentrang;

public class HocSinh {
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	public HocSinh() {
		
	}
	
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}

	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public short getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}

	@Override
	public String toString() {
		String chuoixuat;
		chuoixuat = "\nHọ và Tên: " + tenHS ;
		chuoixuat = chuoixuat + "\nTuổi HS: " + tuoiHS;
		chuoixuat = chuoixuat + "\nLớp HS: " + lopHS;
		return chuoixuat;
		//return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
	

}
