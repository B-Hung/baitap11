import java.util.Scanner;

public class ViDu_14 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b;
		System.out.println("Nhap so a: ");
		a = sc.nextInt();
		System.out.println("Nhap so b: ");
		b = sc.nextInt();
		
		System.out.println(a +" = "+ b +" : "+ (a==b));
		System.out.println(a +" != "+ b +" : "+ (a!=b));
		System.out.println(a +" < "+ b +" : "+ (a<b));
		System.out.println(a +" <= "+ b +" : "+ (a<=b));
		System.out.println(a +" > "+ b +" : "+ (a>b));
		System.out.println(a +" >= "+ b +" : "+ (a>=b));
		System.out.println("-----------------");
		System.out.println("Ca hai so la so chan: "+ (a%2==0 && b%2==0));
		System.out.println("Co mot so la so chan: "+ (a%2==0 || b%2==0));
		sc.close();
	}
}
