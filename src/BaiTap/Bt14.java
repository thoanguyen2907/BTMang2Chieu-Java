package BaiTap;

import java.util.Scanner;

public class Bt14 {
	final static int MIN = -50;
	final static int MAX = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);      
		int soDong = nhapN(scan);                   
		int soCot = nhapN(scan);                    
		int a[][] = taoMang(soDong, soCot);  
		xuatMang(a,soDong, soCot);                  
		System.out.println("\n"); 
		int soMax = soMax(a,soDong, soCot); 
		System.out.println("Số lớn nhất trong ma trận : "+ soMax); 
		int b[][] = demPhanTu(a,soDong, soCot); 
		System.out.println(b);
		inSLPTGiongNhau(a, soDong, soCot); 
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
	
	public static int soMax (int a[][], int soDong, int soCot) {
		int soMax = a[0][0]; 
		for (int i=0; i< soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if(a[i][j] > soMax) {
					soMax = a[i][j]; 
				}
			}
		}
		return soMax;
	}
	public static int[][]  demPhanTu(int a[][],int soDong, int soCot ) {
		int b[][] = new int [soDong][soCot]; 
		for (int i = 0; i < soDong; i++) {	
			for (int j = 0; j < soCot -1; j++) {	
				b[i][j]=0;
				if(a[i][j] == a[i][j+1]) {
					if(j < i) {
						break; 
					} else {
						b[i][j]++; 
					}
				}
			}
		}
		return b; 
	}
	public static void inSLPTGiongNhau(int a[][], int soDong, int soCot) {
		int b[][] = demPhanTu(a, soDong, soCot );
//		for (int i = 0; i < soDong; i++) {
//			for (int j = 0; j < soCot; j++) {	
//			if(b[i][j] != 0) {
//				System.out.print(a[i][j] + "[" + b[i][j]+ "]"+"\t"); 
//			}
//		}
//		}
		int soMax = soMax(b,soDong, soCot );
		System.out.print("Số lặp lại nhiều nhất : " + soMax);
	}
}
