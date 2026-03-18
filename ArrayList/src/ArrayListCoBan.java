import java.util.ArrayList;
import java.util.List;

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
	        

	}

}
