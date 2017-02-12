package ex01;

import java.util.Scanner;

public class tongbangnhau {
	int arr1[];
	int arr2[];
	int t1[] = new int[1000000];
	int t2[] = new int[1000000];
	int n,m;
	void input(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr1 = new int[n+1];
		for (int i = 1;i<=n;i++)
			arr1[i] = sc.nextInt();
		m = sc.nextInt();
		arr2 = new int[m+1];
		for (int i = 1;i<=m;i++)
			arr2[i] = sc.nextInt();
	}
	int hieu(){
		int sum1 = 0;
		for (int i = 1;i<=n;i++)
			sum1+=arr1[i];
		int sum2 = 0;
		for (int i = 1;i<=m;i++)
			sum2+=arr2[i];
		return (sum1-sum2)/2;
	}
	void init(){
		for (int i = 1;i<=n;i++)
			t1[arr1[i]] = i;
		for (int i = 1;i<=m;i++)
			t2[arr2[i]] = i;
	}
	void result(){
		int s = hieu();
		if (s>0)
		for (int i = 1;i<=m;i++){
			if (t1[s + arr2[i]] != 0){
				System.out.println(t1[s+arr2[i]]+" "+i);
			}
		}
		else{
			s = - s;
			for (int i = 1;i<=n;i++){
				if (t1[s + arr1[i]] != 0){
					System.out.println(i+" "+t2[s+arr1[i]]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		tongbangnhau tb = new tongbangnhau();
		tb.input();
		tb.init();
		tb.result();
	}
}
