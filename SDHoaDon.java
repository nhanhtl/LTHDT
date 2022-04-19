package buoi5;

import java.util.Scanner;

public class SDHoaDon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so hoa don: ");
		int n = sc.nextInt();
		HoaDon ds[] = new HoaDon[n];
		int c=0;
		for(int i=0; i<n; i++) {
			System.out.print("\nNhap hoa don thu " +(i+1) +":");
			ds[i] = new HoaDon();
			ds[i].nhap();
		}
		System.out.print("\nDanh sach hoa don:");
		for(int i=0; i<n; i++) 
			System.out.print("\nHoa don thu " +(i+1) +":" +ds[i]);
	}

}
