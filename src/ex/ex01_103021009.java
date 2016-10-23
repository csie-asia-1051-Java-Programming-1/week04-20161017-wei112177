package ex;

/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex01_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		int count = -1;
		while (i != -1) {
			count++;
			sum += i;
			i = scn.nextInt();
		}
		System.out.println(sum);
		System.out.println((double)sum/count);
	}
}
