import java.util.Scanner;

public class ViDu_11 {
	public static void main(String[] args) {
        // Khai báo biến 
		int a, b;
		
		// Nhập dữ liệu
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao b: ");
		b = sc.nextInt();
		sc.close();
		 int tong = a + b;
		 int hieu = a - b;
		 int nhan = a * b;
		 float thuong = (float)a / b;
		 int soDu = a % b;
		 
		 System.out.println("tong: "+tong);
		 System.out.println("hieu: "+hieu);
		 System.out.println("nhan: "+nhan);
		 System.out.println("thuong: "+thuong);
		 System.out.println("So du: "+soDu);
	}
}
