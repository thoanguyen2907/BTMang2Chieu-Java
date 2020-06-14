package BaiTap;

import java.util.Scanner;

public class BT4 {
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
		int soNguyenToDauTien = soNguyenToDauTien(a, soDong, soCot);
		if (soNguyenToDauTien == 0) {
			System.out.println("Không có số nguyên tố trong mảng"); 
			
		} else {
			System.out.println("Số nguyên tốt đầu tiên " + soNguyenToDauTien); 
		}
		
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
	 public static boolean isPrimeNumber(int n) {
	        // so nguyen n < 2 khong phai la so nguyen to
	        if (n < 2) {
	            return false;}
	        // check so nguyen to khi n >= 2
	        int squareRoot = (int) Math.sqrt(n);
	        for (int i = 2; i <= squareRoot; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 public static int soNguyenToDauTien (int a[][], int soDong, int soCot) {
		 boolean flag; 
		 int soNguyenToDauTien = 0; 
		 for (int i = 0 ; i < soDong; i++) {
			 flag = false; 
			 for (int j = 0; j < soCot; j++) {
				 if(isPrimeNumber(a[i][j])) {
					 soNguyenToDauTien = a[i][j]; 
					 flag = true; 
					 break; 
				 }
			 }
			 if(flag) {
				 return soNguyenToDauTien; 
			 }
		 }
		 return soNguyenToDauTien; 
	 }
}
