package ex01;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	int n;
	int arr[];
	void input(){
		n = 1000000;
		arr = new int[n];
		Random t = new Random();
		for (int i = 0;i<n;i++)
			arr[i] = t.nextInt(1000);
	}
	void print(){
		for (int i = 0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	void  MS(int L,int R){
		int m = (L+R)/2;
		int v = 0;
		int i = L;
		int j = m+1;
		int t[] = new int [R-L+1];
		while (i<=m && j<=R){
			if (arr[i]<arr[j]) t[v++] = arr[i++];
			else t[v++] = arr[j++];
		}
		while (i<=m) t[v++] = arr[i++];
		while (j<=R) t[v++] = arr[j++];
		for (i = 0;i<=R-L;i++) arr[L+i] = t[i];
	}
	void mergeSort(int L,int R){
		if (L<R){
			int m = (L+R)/2;
			mergeSort(L,m);
			mergeSort(m+1,R);
			MS(L, R);
		}
	}
	public static void main(String[] args) {
		MergeSort mr = new MergeSort();
		mr.input();
//		mr.print();
		long t1 = System.currentTimeMillis();
		mr.mergeSort(0, mr.n-1);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
//		mr.print();
		
	}
}
