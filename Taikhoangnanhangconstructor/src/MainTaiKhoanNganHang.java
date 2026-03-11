public class MainTaiKhoanNganHang {
    public static void main(String[] args) {

        // Tạo tài khoản với constructor 1
        TaiKhoanNganHang tk1 = new TaiKhoanNganHang("01");
        System.out.println("TK1: " + tk1.getSoTaiKhoan() + " - " + tk1.getTenChuTaiKhoan() + " - Số dư: " + tk1.getSoDu());

        // Tạo tài khoản với constructor 2
        TaiKhoanNganHang tk2 = new TaiKhoanNganHang("02", "Nguyen Van A");
        System.out.println("TK2: " + tk2.getSoTaiKhoan() + " - " + tk2.getTenChuTaiKhoan() + " - Số dư: " + tk2.getSoDu());

        // Tạo tài khoản với constructor 3
        TaiKhoanNganHang tk3 = new TaiKhoanNganHang("03", "Tran Thi B", 1000);
        System.out.println("TK3: " + tk3.getSoTaiKhoan() + " - " + tk3.getTenChuTaiKhoan() + " - Số dư: " + tk3.getSoDu());
        System.out.println("TK1: " + tk1.getSoDu());
        System.out.println("TK2: " + tk2.getSoDu());
        System.out.println("TK3: " + tk3.getSoDu());


    }
}
