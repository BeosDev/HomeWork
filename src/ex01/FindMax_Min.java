package ex01;

import java.util.Random;

public class FindMax_Min {
	int n;
	int arr[];
	void input(){
		n = 10000;
		arr = new int[n];
		Random r = new Random();
		for (int i = 0;i<n;i++)
			arr[i] = r.nextInt(1000);
	}
	int findMax(int L,int R){
		int max = arr[L];
		for (int i = L+1;i<=R;i++)
			max = Math.max(max, arr[i]);
		return max;
	}
	int findMin(int L,int R){
		int min = arr[L];
		for (int i = L+1;i<=R;i++)
			min = Math.min(min, arr[i]);
		return min;
	}
	void print(){
		int max1,max2;
		int min1,min2;
		int mid = n/2;
		max1 = findMax(0,mid);
		max2 = findMax(mid+1,n-1);
		min1 = findMin(0,mid);
		min2 = findMin(mid+1,n-1);
	}
	public static void main(String[] args) {
		
	}
}   
