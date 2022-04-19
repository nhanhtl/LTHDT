package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String hten, cmnd, dchi;
	public KhachHang() {
		hten = new String();
		cmnd = new String();
		dchi = new String();
	}
	
	public KhachHang(String hten1, String cmnd1, String dchi1) {
		hten = new String(hten1);
		cmnd = new String(cmnd1);
		dchi = new String(dchi1);
	}
	
	public KhachHang(KhachHang KH) {
		hten = new String(KH.hten);
		cmnd = new String(KH.cmnd);
		dchi = new String(KH.dchi);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ho ten khach hang:");
		hten = sc.nextLine();
		System.out.print("\nNhap chung minh nhan dan khach hang:");
		cmnd = sc.nextLine();
		System.out.print("\nNhap dia chi khach hang:");
		dchi = sc.nextLine();
	}
	
	public void in() {
		System.out.print("\nHo ten khach hang:m" + hten);
		System.out.print("\nNhap chung minh nhan dan khach hang: " + cmnd);
		System.out.print("\nNhap dia chi khach hang: " + dchi);
	}
	
	public String toString() {
		String st="";
		st += ("\nHo ten khach hang: " + hten);
		st += ("\nChung minh nhan dan khach hang: " + cmnd);
		st += ("\nDia chi khach hang: " + dchi);
		return st;
	}
	
	public float layTle() {
		return 0;
	}
}
