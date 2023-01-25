package test;

import java.util.Scanner;

public class ReturnBiHexa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(getFormats(num));
	}

	private static String getFormats(int n) {
		// TODO Auto-generated method stub
		int num=n;
		int[] binaryNum=new int[32];
		int[] hexaNum=new int[100];
		int[] octaNum=new int[100];
		int i=0;
		int j=0;
		int k=0;
		while(num>0){
			binaryNum[i]=num%2;
			num=num/2;
			i++;
		}
		
		while(num>0) {
			hexaNum[j]=num%16;
			num=num/10;
			j++;
		}
		
		while(num>0) {
			octaNum[k]=num%8;
			num=num%10;
			k++;
		}
		String s=binaryNum.toString()+","+hexaNum.toString()+","+octaNum.toString();
		System.out.println(binaryNum.toString());
		return s;
	}
}
