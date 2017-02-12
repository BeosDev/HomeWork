package ex01;

import java.util.Scanner;

public class maybaychoxang {

	int res = -1;
	int n;
	int arr[] = new int[1000];
	boolean isAva[] = new boolean[1000];
	int result[] = new int[1000];

	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();
	}

	int count = 0;

	void print() {
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[result[i]]);
		}
		count++;
		System.out.println();
	};

	void qh(int x, int s) {
		if (x == n + 1) {
			print();
		}
		for (int i = 1; i <= n; i++)
			if (isAva[i]) {
				s = s + res * arr[i];
				if (res == -1 && s < 0) {
					result[x] = i;
					// cout<<s<<" "<<res<<endl;
					res = res * (-1);
					isAva[i] = false;
					qh(x + 1, s);
					result[x] = 0;
					res = res * (-1);
					isAva[i] = true;
				} else if (s > 0 && res == 1) {
					result[x] = i;
					// cout<<s<<" "<<res<<endl;
					res = res * (-1);
					isAva[i] = false;
					qh(x + 1, s);
					result[x] = 0;
					res = res * (-1);
					isAva[i] = true;
				}
				s = s - res * arr[i];
			}
	}

	void tim(int i, int d) {
		if (i > n)
			print();
		else
			for (int j = 1; j <= n; j++) {
				if (isAva[j] && arr[j] > d) {
					result[i] = j;
					isAva[j] = false;
					tim(i + 1, arr[j] - d);
					result[i] = 0;
					isAva[j] = true;
				}
			}
	}

	public static void main(String[] args) {
		maybaychoxang m = new maybaychoxang();
		m.input();
		long t1 = System.currentTimeMillis();
		for (int i = 1;i<=m.n;i++)
			m.isAva[i] = true;
		m.qh(1, 2);
		long t2 = System.currentTimeMillis();
		System.out.println(m.count+" "+(t2-t1));
	}
}
