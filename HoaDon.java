package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class HoaDon {
	private String mso, tde, nv;
	private Date d;
	private KhachHang k;
	private ChiTiet c[];
	private int sl;
	
	public HoaDon() {
		mso = new String();
		tde = new String();
		nv = new String();
		d = new Date();
		k = new KhachHang();
		c = new ChiTiet[20];
		sl = 0;
	}
	
/*	public HoaDon(String mso1, String tde1, String nv1, Date d1, KhachHang k1, int c1, int sl1 ) {
		mso = new String(mso1);
		tde = new String(tde1);
		nv = new String(nv1);
		d = new Date(d1);
		k = new KhachHang();
		c = new ChiTiet[c1];
		sl= sl1;
	}*/
	
	
	public HoaDon(HoaDon hd) {
		mso = new String(hd.mso);
		tde = new String(hd.tde);
		nv = new String(hd.nv);
		d = new Date(hd.d);
		k = new KhachHang(hd.k);
		c = new ChiTiet[hd.c.length];
		sl = hd.sl;
		for (int i=0; i<sl; i++) {
			c[i] = new ChiTiet(hd.c[i]);
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap ma so hoa don:");
		mso = sc.nextLine();
		System.out.print("Nhap tieu de hoa don:");
		tde = sc.nextLine();
		System.out.print("Nhap nguoi lap hoa don:");
		nv = sc.nextLine();
		System.out.print("Nhap ngay lap hoa don:");
		d.nhap();
		int t=0;
		System.out.print("Nhap thong tin khac hang (0) hay khach hang vip (1):");
		t = sc.nextInt();
		if (t==1) k = new KhachHangVIP();
		k.nhap();
		System.out.print("\nNhap so luong chi tiet san pham:");
		sl = sc.nextInt();
		for (int i=0; i<sl; i++) {
			System.out.print("\nNhap chi tiet san pham thu " + (i+1) + ":");
			c[i] = new ChiTiet();
			c[i].nhap();
		}
	}
	
	public void in() {
		System.out.print("Ma so:" + mso + "," + tde);
		System.out.print("\nNguoi lap: " + nv);
		System.out.print("\nNgay lap: " + d + "\nKhach hang: " + k);
		System.out.print("\nCac chi tiet hoa don:");
		for (int i=0; i<sl; i++) 
			System.out.print("\n + " + (i+1) + c[i]);
		System.out.print("\nTong so tien: " + tong());
	}
	
	public String toString() {
		String s = ("Ma so:" + mso + "," + tde);
		s += ("\nNguoi lap: " + nv);
		s += ("\nNgay lap: " + d + "\n Khach hang: " + k);
		s += ("\n Cac chi tiet hoa don:");
		for (int i=0; i<sl; i++) 
			s += ("\n + " + (i+1) + c[i]);
		s += ("\n Tong so tien: " + tong());
		return s;
	}
	
	public float tong() {
		float t = 0;
		for (int i=0; i<sl; i++) {
			t += c[i].laySluong() * c[i].layDgia();
		}
		t = t - t*k.layTle();
		return t;
	}
	
}
