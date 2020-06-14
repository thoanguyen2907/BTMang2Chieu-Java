package BaiTap;

import java.util.Scanner;

public class BT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = nhapMang(soDong, soCot, scan); 
		xuatMang(a,soDong, soCot); 
		boolean soAmDauTien  = soAmDauTien(a,soDong, soCot);
		if(soAmDauTien) {
			System.out.println("Có PT âm trong mảng ");
		} else {
			System.out.println("Mảng toàn số dương");
		}
		 
	}
	public static int nhapN (Scanner scan) {
		int n; 
		do {
			System.out.println("Vui long nhap gia tri n > 1 "); 
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1); 
		return n;
	}
	public static int[][]nhapMang(int soDong, int soCot, Scanner scan) {
		int a[][] = new int [soDong][soCot]; 
		for (int i = 0; i< soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a["+i+"]"+"["+j+"]= "); 
				a[i][j] = Integer.parseInt(scan.nextLine());
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
	public static boolean soAmDauTien (int a[][], int soDong, int soCot) {
		boolean coSoAm =  false; 
		for (int i=0; i< soDong; i++) {
			coSoAm = false; 
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] < 0) {
					coSoAm = true; 
					break; 
				} 
			}
			if (coSoAm) {
				return coSoAm; 
			} 
		}
		return coSoAm; 
	}
	
	
}
