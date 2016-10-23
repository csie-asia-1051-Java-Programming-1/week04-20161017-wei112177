package ex;

/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex04_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = n; 0 < i; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
