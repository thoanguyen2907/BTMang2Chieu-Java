package BaiTap;

import java.util.Scanner;

public class BT3 {
	final static int MIN = -10;
	final static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot); 
		xuatMang(a,soDong, soCot); 
		System.out.println("\n");
		int soDuongDauTien  = soDuongDauTien(a, soDong, soCot); 
		System.out.println("Số Dương Đầu Tiên trong mảng 2 chiều : " + soDuongDauTien); 
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Vui long nhap gia tri n > 1 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}
		return a;
	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}
	public static int soDuongDauTien(int a[][], int soDong, int soCot) {
		int soDuongDauTien = 1; 
		boolean flag = false; 
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] > 0) {
					soDuongDauTien = a[i][j]; 
					flag = true; 
					break; 
				}
			}
			if (flag) {
				return soDuongDauTien; 
			}
		}
		return soDuongDauTien; 
	} 

}
