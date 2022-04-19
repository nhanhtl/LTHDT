package buoi5;

import java.util.Scanner;

public class SanPham {
	private String mso,ten, nsx;
	
	public SanPham() {
		mso = new String();
		ten = new String();
		nsx = new String();
	}
	
	public SanPham(String mso1, String ten1, String nsx1) {
		mso = new String(mso1);
		ten = new String(ten1);
		nsx = new String(nsx1);
	}
	
	public SanPham(SanPham SP) {
		mso = new String(SP.mso);
		ten = new String(SP.ten);
		nsx = new String(SP.nsx);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ma so san pham:");
		mso = sc.nextLine();
		System.out.print("\nNhap ten san pham:");
		ten = sc.nextLine();
		System.out.print("\nNhap ngay san xuat:");
		nsx = sc.nextLine();
	}
	
	public void in() {
		System.out.print("\nMa so san pham:" + mso);
		System.out.print("\nTen san pham:" + ten);
		System.out.print("\nNgay san xuat:");
	}
	
	public String toString() {
		String S = "";
		S += ("\nMa so san pham:" + mso);
		S += ("\nTen san pham:" + ten);
		S += ("\nNgay san xuat:" + nsx);
		return S;
	}
}
