package BaiTap;

import java.util.Scanner;

public class BT5 {
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
		int giaTriAmLonNhat  = giaTriAmLonNhat(a, soDong, soCot); 
		System.out.println("Số Âm lớn nhất trong mảng 2 chiều : " + giaTriAmLonNhat); 
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
	public static boolean ktSoAm (int x) {
		if (x < 0) {
			return true; 
		} else {
			return false; 
		}
	}
	public static int soAmDauTien(int a[][], int soDong, int soCot) {
		int soAmDauTien = 0; 
		boolean flag = false; 
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (ktSoAm(a[i][j])) {
					soAmDauTien = a[i][j]; 
					flag = true; 
					break; 
				}
			}
			if(flag) {
				return soAmDauTien; 
			}
		}
		return soAmDauTien; 
	}
	public static int giaTriAmLonNhat(int a[][], int soDong, int soCot) {
		int soAmDauTien = soAmDauTien(a, soDong, soCot); 
		int giaTriAmLonNhat  = soAmDauTien; 
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (ktSoAm(a[i][j])) {
					if (a[i][j] < giaTriAmLonNhat) {
						giaTriAmLonNhat = a[i][j]; 
					}
				}
			}
			}
		return giaTriAmLonNhat; 
	}

}
