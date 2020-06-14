package BaiTap;

import java.util.Scanner;

public class BT9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);      
		int soDong = nhapN(scan);                   
		int soCot = nhapN(scan);                    
		int a[][] = nhapMang(soDong, soCot, scan);  
		xuatMang(a,soDong, soCot);                  
		System.out.println("\n");   
		tinhTongCotTrial(a,soDong, soCot); 
		                                            
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
	public static void tinhTongCotTrial (int a[][], int soDong, int soCot) {
		for (int j=0; j< soCot; j++) { 
			int tong = 0; 
			for (int i =0; i < soDong; i++) { 
				if (a[i][j] % 2 != 0) {
						tong += a[i][j];
				}				
	}
			System.out.println("tổng cột "+j+" là " + tong);        
		} 
	}
	}                                                               
	                                                                                                                                                                 
		                          		                      
