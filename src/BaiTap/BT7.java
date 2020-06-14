package BaiTap;

import java.util.Scanner;

public class BT7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = nhapMang(soDong, soCot, scan); 
		xuatMang(a,soDong, soCot); 
		System.out.println("Vui long nhap cột kiểm tra giá trị:  ");
		int y  = Integer.parseInt(scan.nextLine());
		boolean cotGiamDan = cotGiamDan(a,soDong, y); 
		if (cotGiamDan) {
			System.out.println("Cot "+y+" giam dan"); 
		}else {
			System.out.println("Cot "+y+" ko giam dan"); 
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
	public static boolean cotGiamDan (int a[][], int soDong, int y) {
		boolean flag = true; 
		for (int i=0; i< soDong -1; i++) {
			flag = true; 
				if (a[i][y] <  a[i+1][y]) {
					flag = false; 
					break; 				
			}
			return flag; 
		}
		return flag; 
	}
}
