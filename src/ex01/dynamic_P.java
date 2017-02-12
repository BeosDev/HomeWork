package ex01;
public class dynamic_P {
	long a[][];
	void init(int n,int m){
		a = new long[100][100];
		for (int i = 0;i<=n;i++){
			a[i][0] = 1;
		}
		for (int i = 0;i<=m;i++){
			a[0][i] = 1;
		}
	}
	void ck(int n,int m){
		init(n,m);
		for (int i = 1;i<=n;i++)
			for (int j = 1;j<=m;j++){
				a[i][j] = a[i][j-1] + a[i-1][j];
			}
		System.out.println(a[n][m]);
	}
	void ck2(int n,int m){
		long d1[] = new long[1000];
		for (int i = 0;i<=m;i++)
			d1[i] = 1;
		for (int i = 0;i<n;i++){
			long temp = 1;
			for (int j = 1;j<=m;j++){
				d1[j] = d1[j] + temp;
				temp = d1[j];
			}
		}
		System.out.println(d1[m]);
	}
	public static void main(String[] args) {
		dynamic_P t = new dynamic_P();
		t.ck2(110,110);
	}
}
