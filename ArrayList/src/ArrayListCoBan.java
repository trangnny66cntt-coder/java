
public class ArrayListCoBan {

	public static void main(String[] args) {
		   System.out.println("=== ARRAYLIST CƠ BẢN - MINH HỌA CÁC PHƯƠNG THỨC ===\n");
	        
	        // 1. Khai báo ArrayList với Generics
	        List<String> danhSachTen = new ArrayList<>();
	        
	        // 2. Thêm phần tử - add()
	        System.out.println("--- THÊM PHẦN TỬ ---");
	        danhSachTen.add("Nguyễn Văn A");
	        danhSachTen.add("Trần Thị B");
	        danhSachTen.add("Lê Văn C");
	        
	        // Thêm tại vị trí cụ thể - add(index, element)
	        danhSachTen.add(1, "Phạm Thị D"); // Chèn vào vị trí 1
	        
	        System.out.println("Danh sách sau khi thêm: " + danhSachTen);
	        
	        // 3. Lấy kích thước - size()
	        System.out.println("\n--- KÍCH THƯỚC ---");
	        System.out.println("Số phần tử: " + danhSachTen.size());
	        // 4. Truy cập phần tử - get()
	        System.out.println("\n--- TRUY CẬP PHẦN TỬ ---");
	        System.out.println("Phần tử thứ 0: " + danhSachTen.get(0));
	        System.out.println("Phần tử thứ 2: " + danhSachTen.get(2));
	        
	        // 5. Cập nhật phần tử - set()
	        System.out.println("\n--- CẬP NHẬT PHẦN TỬ ---");
	        System.out.println("Trước khi cập nhật: " + danhSachTen.get(1));
	        danhSachTen.set(1, "Trần Thị B (Đã đổi tên)");
	        System.out.println("Sau khi cập nhật: " + danhSachTen.get(1));
	        
	        // 6. Tìm kiếm - contains(), indexOf()
	        System.out.println("\n--- TÌM KIẾM ---");
	        System.out.println("Có 'Lê Văn C' không? " + danhSachTen.contains("Lê Văn C"));
	        System.out.println("Vị trí của 'Lê Văn C': " + danhSachTen.indexOf("Lê Văn C"));
	        System.out.println("Vị trí của 'Không tồn tại': " + danhSachTen.indexOf("Không tồn tại"));
	        
	        // 7. Xóa phần tử - remove()
	        System.out.println("\n--- XÓA PHẦN TỬ ---");
	        System.out.println("Trước khi xóa: " + danhSachTen);
	        
	        // Xóa theo chỉ số
	        

	}

}
