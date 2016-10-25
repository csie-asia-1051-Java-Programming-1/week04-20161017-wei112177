package hw;

/*
 * Topic: 使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )
 * 1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw01_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 0, b = 1;
		System.out.print("產生幾個費氏數列：");
		int n = scn.nextInt() ;
		System.out.print(b+" , ");
		for (int i = 1; i < n; i++) {
			b += a;
			a = b - a;
			System.out.print(b+" , ");
		}
	}
}