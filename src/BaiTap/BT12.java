package BaiTap;

import java.util.Scanner;

public class BT12 {
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
		 PTChanCuoiCung(a,soDong, soCot); 	
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
	public static void PTChanCuoiCung(int a[][], int soDong, int soCot) {
		int soChanCuoiCung = 0; 
		boolean flag; 
		for (int i= a.length -1; i >= 0; i--) {
			flag = false; 
			for (int j = a.length -1; j >= 0; j--) {
				if (a[i][j] % 2 == 0) {
					soChanCuoiCung = a[i][j];
					flag = true; 
					break; 		
				}
		}
			if (flag) {
				System.out.println("PT Chẵn cuối cùng trong mảng: "+ soChanCuoiCung);
				break;
			}
	}
}
}