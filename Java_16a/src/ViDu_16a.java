import java.util.Scanner;

public class ViDu_16a {
	public static void main(String[] args) {
		double r, chuVi, dienTich;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh: ");
		r = sc.nextDouble();
		
		// Chu vi hinh tron
		chuVi = Math.PI * 2 * r;
		System.out.println("Chu vi = " + chuVi);
		System.out.println("Chu vi = " + Math.round(chuVi));
		System.out.println("Chu vi = " + Math.round(chuVi*100.0)/100.0);
		
		// Dien tich hinh tron
		dienTich = Math.PI * Math.pow(r, 2);
		System.out.println("Dien tich = " + dienTich);
		System.out.println("Dien tich = " + Math.round(dienTich));
		System.out.println("Dien tich = " + Math.round(dienTich*100.0)/100.0);
         sc.close();
	}
}
