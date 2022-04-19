package buoi2;

import java.util.Scanner;

public class Date {
	private int d, m, y;
	
	public Date() {
		d = 1;
		m = 1;
		y = 2022;
	}
	
	public Date(int d1, int m1, int y1) {
		d = d1;
		m = m1;
		y = y1;
	}
	
	public Date(Date obj) {
		d = obj.d;
		m = obj.m;
		y = obj.y;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("\nNhap ngay: ");
			d = sc.nextInt();
			System.out.print("Nhap thang: ");
			m = sc.nextInt();
			System.out.print("Nhap nam: ");
			y = sc.nextInt();
			if(!hopLe()) System.out.print("Ngay khong hop le, nhap lai! ");
		}
		while (!hopLe());
	}
	
	public void hienThi() {
		System.out.print(d + "/" + m + "/" + y);
	}
	
	public String toString() {
		return (d + "/" + m + "/" + y);
	}
	
	public boolean hopLe() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(y % 4 == 0) max[2] = 29;
		boolean h = false;
		if(y > 0 && m > 0 && m < 13 && d > 0 && d <= max[m]) h = true;
		return h;
	}
	
	public Date ngayHomSau() {
		Date next = new Date(d, m, y);
		if (next.hopLe()) {
			next.d++;
			if (!next.hopLe()) {
				next.d = 1;
				next.m++;
				if (!next.hopLe()) {
					next.m = 1;
					next.y++;
				}
			}
		}
			return next;
	}
	
	public Date congNgay(int n) {
		Date ngay = new Date(d, m, y);
		for (int i=0; i<n; i++) {
			ngay = ngay.ngayHomSau();
		}
		return ngay;
	}
}
