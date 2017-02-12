package ex01;

import java.math.BigInteger;
import java.util.Stack;

public class divideMu {
	BigInteger pow(long x,long y){
		String s1 = String.valueOf(x);
		BigInteger t1 = new BigInteger(s1);
		return pow(t1,y);
	}
	BigInteger two = new BigInteger("2");
	BigInteger pow(BigInteger x,long y){
		if (y< 2){
			return x;
		}
		if (y%2 != 0){
			return  x.multiply(pow(x,y-1));
		}
		else{
			BigInteger kq = pow(x,y/2);
			return kq.multiply(kq);
		}
		
	}
	void khudequy(int x,int y){
		BigInteger result = BigInteger.ONE;
		BigInteger temp = new BigInteger(String.valueOf(x));
		while (y  > 0){
			if (y % 2 == 1 )
				result = result.multiply(temp);
				temp = temp.multiply(temp);
				y = y/2;;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		divideMu t = new divideMu();
		t.khudequy(2,100);
	}
}
