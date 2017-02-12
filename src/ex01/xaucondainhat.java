package ex01;

import java.util.Scanner;

public class xaucondainhat {
	int f[][];
	String st1,st2;
	void input(){
		Scanner sc = new Scanner(System.in);
		st1 = sc.nextLine();
		st2 = sc.nextLine();
	}
	void qhd(){
		f = new int[st1.length()+1][st2.length()+1];
		f[0][0] = 0;
		for (int i = 1;i<=st1.length();i++)
			for (int j = 1;j<=st2.length();j++)
				if (st1.charAt(i-1) == st2.charAt(j-1))
					f[i][j] = 1 + f[i-1][j-1];
				else
					f[i][j] = Math.max(f[i-1][j], f[i][j-1]);
		System.out.println(f[st1.length()][st2.length()]);
	}
	void truyvan(){
		int i = st1.length()-1;
		int j = st2.length()-1;
		String st = "";
		while (i>=0 && j>=0){
			if (st1.charAt(i) == st2.charAt(j)){
				st = st1.charAt(i) + st;
				i--;
				j--;
			}
			else{
				if (f[i][j] == f[i-1][j]) i--;
				else j--;
			}
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		xaucondainhat s = new xaucondainhat();
		s.input();
		s.qhd();
		s.truyvan();
	}
}
