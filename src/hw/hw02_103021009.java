package hw;

/*
 * Topic: 使用者輸入正整數 n 與 m 然後計算C(n,m)
 * Date: 2016/10/17
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw02_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int w=n-m;

		int sum = 1;
		int sum1 = 1;
		int sum2 = 1;

		while (n > 0) {
			sum *= n;
			n--;
		}
		while (m > 0) {
			sum1 *= m;
			m--;
		}
		while(w>0){
			sum2*=w;
			w--;
		}
		System.out.println(sum/(sum1*sum2));
	}

}
