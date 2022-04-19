package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private SanPham S;
	private long sluong, dgia;
	public ChiTiet() {
		S = new SanPham();
		sluong = 0;
		dgia = 0;
	}
	
	public ChiTiet(SanPham S1, long sluong1, long dgia1) {
		S = new SanPham (S1);
		sluong = sluong1;
		dgia = dgia1;
	}
	
	public ChiTiet(ChiTiet C) {
		S = new SanPham(C.S);
		sluong = C.sluong;
		dgia = C.dgia;
	}
	
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.print("\nNhap thong tin san pham:");
		S.nhap();
		System.out.print("\nNhap so luong san pham:");
		sluong = sc.nextLong();
		System.out.print("\nNhap gia san pham:");
		dgia = sc.nextLong();
	}
	
	public void in() {
		System.out.print("Thong tin san pham:");
		S.in();
		System.out.print("\nSo luong san pham: " + sluong);
		System.out.print("\nDon gia san pham: " + dgia);
	}
	
	public String toString() {
		String st = "";
		st += ("\nSo luong san pham: " + sluong);
		st += ("\nDon gia san pham: " + dgia);
		return S.toString() + st;
	}
	
	public long laySluong() {
		return sluong;
	}
	
	public long layDgia() {
		return dgia;
	}
}
