package hw;

/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n
 * Date: 2016/10/17
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw03_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		boolean str = true;
		int a = 0, b = 0, c = 0;
		char n;
		int i = 0;
		System.out.println("輸入數字:");

		while (str) {
			i = scn.nextInt();
			if (i > 0 && i != 999) {
				a++;
			} else if (i == 0) {
				b++;
			} else if (i < 0) {
				c++;
			} else if (i == 999) {
				System.out.println("輸入" + a + "個正整數," + b + "個0以及," + c
						+ "個負整數");
				System.out.println("是否繼續，如果要繼續請按任意鍵，結束請按n。");
				n = scn.next().charAt(0);
				if (n != 'n') {
					a = 0;
					b = 0;
					c = 0;
					str = true;
					System.out.println("再輸入數字:");
				} else if (n == 'n') {
					str = false;
					System.out.println("結束此程式");
				}
			}
		}
	}
}
