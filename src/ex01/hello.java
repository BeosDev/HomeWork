package ex01;

import java.util.Scanner;

public class hello {
	int s = 0;
	int a[] = new int [100];
	int n;
	void print(int n){
		int count = 0;
		for (int i = 1;i<=n;i++)
			if (a[i] == 1)
				count++;
		if (count <= 2){
			for (int i = 1 ;i<=n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
	int sb = 0;
	void phantich(int ll){
		if (0 == ll){
			print(sb);
		}
		else{
			for (int i =1;i<=2;i++)
				if (i<=ll){
					sb++;
					a[sb] = i;
					phantich(ll-i);
					sb--;
				}
		}
	}
	void phantich(int ll,int j){
		if (0 == ll){
			for (int i = 1;i<=sb;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
		else{
			if (j<2){
			for (int i =1;i<=2;i++)
				if (i<=ll){
					sb++;
					a[sb] = i;
					if (i == 1) 
					phantich(ll-i,j+1);
					else phantich(ll-i,j);
					sb--;
				}
			}
			else if (2<=ll){
					sb++;
					a[sb] = 2;
					phantich(ll-2,j);
					sb--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello s = new hello();
		long t1 = System.currentTimeMillis();
		s.phantich(54,0);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}

}
