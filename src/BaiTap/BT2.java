package BaiTap;

import java.util.Scanner;

public class BT2 {
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
		int tinhTongPTChan = tinhTongPTChan (a,soDong, soCot);  
		System.out.println("\n");
		System.out.println("Tổng các số chẵn trong mảng : " + tinhTongPTChan); 
	}
	public static int nhapN (Scanner scan) {
		int n; 
		do {
			System.out.println("Vui long nhap gia tri n > 1 "); 
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1); 
		return n;
	}
	public static int[][]taoMang(int soDong, int soCot) {
		int a[][] = new int [soDong][soCot]; 
		for (int i = 0; i< soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int)(Math.random() * ((MAX - MIN) + 1 ));
			}
		}
		return a; 
	}
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i=0; i< soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j]+"\t"); 
			}
			System.out.println("\t"); 
		}
		}
	public static int tinhTongPTChan(int a[][], int soDong, int soCot) {
		int tong = 0; 
		for (int i=0; i< soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] % 2 == 0) {
					System.out.print(a[i][j]+"\t"); 
					tong += a[i][j]; 
				} 
			}
			}
		return tong; 
	}
	
}
