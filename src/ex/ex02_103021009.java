package ex;

/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 103021009 周永振老師
 */
import java.util.*;

public class ex02_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		String str = "Y";
		while()
		for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				}
				System.out.println();
			}
		System.out.println("是否繼續:");
		if (){
			
		}
		System.out.println("結束");
	}
}
