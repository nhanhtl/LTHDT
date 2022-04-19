package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class KhachHangVIP extends KhachHang {

	private float tle;
	private Date d;
	
	public KhachHangVIP() {
		super();
		tle = 0.0f;
		d = new Date();
	}
	
	public KhachHangVIP(float tle1, Date d1) {
		super();
		tle = tle1;
		d = new Date(d1);
	}
	
	public KhachHangVIP(KhachHangVIP KHV) {
		super(KHV);
		tle = KHV.tle;
		d = new Date(KHV.d);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ti le giam cho khach hang vip:");
		tle = sc.nextFloat();
		System.out.print("\nNhap ngay thang hang khach hang vip:");
		d.nhap();
	}
	
	public void in() {
		super.in();
		System.out.print("\nTi le giam khach hang vip:" + tle);
		System.out.print("\nNgay thang hang khach hang vip:"); d.hienThi();
	}
	
	public String toString() {
		String st="";
		st += ("\nTi le  giam khach hang vip:" + tle);
		st += ("\nNgay thang hang khach hang vip:" + d.toString());
		return super.toString()+ st;
	}
	
	public float layTle() {
		return tle;
	}
}
