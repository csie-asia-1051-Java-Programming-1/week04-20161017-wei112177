package hw;

/*
 * Topic: 讓使用者輸入1, 2, 3, 與4選項，
 1.輸入 n 並顯示圖形 (ex: n = 5)
 2.輸入 n 並顯示圖形
 3.輸入 n (必須是奇數)並顯示圖形
 4.結束程式
 * Date: 2016/10/17
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw04_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入選項:");
		int i = scn.nextInt();

		if (i == 1) {
			System.out.println("請輸入數值:");
			int n = scn.nextInt();
			for (int a = n - 2; 0 < a; a--) {
				for (int b = 0; b < a; b++) {
					System.out.print("@");
				}
				System.out.println();
			}
			for (int a = n - 3; 0 < a; a--) {
				for (int b = n - 2; a <= b; b--) {
					System.out.print("@");
				}
				System.out.println();
			}
		} else if (i == 2) {
			System.out.println("請輸入數值:");
			int n = scn.nextInt();
			for (int a = n - 3; 0 < a; a--) {
				for (int b = n - 2; a < b; b--) {
					System.out.print("%");
				}
				System.out.println();
			}
			for (int a = n - 2; 0 < a; a--) {
				for (int b = 0; b < a; b++) {
					System.out.print("%");
				}
				System.out.println();
			}
		} else if (i == 3) {
			System.out.println("請輸入數值:");
			int n = scn.nextInt();
			int x = n - 1;
			for (int a = 1; a < n; a += 2) {
				for (int b = 0; b <x; b++) {
					System.out.print(" ");
				}
				for (int c = 0; c < a; c++) {
					System.out.print("#");
				}
				System.out.println();
				x--;
			}
			for (int a = 0; a < n; a +=2) {
				for (int b = 0; b < x; b++) {
					System.out.print(" ");
				}
				for (int c = n; c > a; c--) {
					System.out.print("#");
				}
				System.out.println();
				x++;
			}
		} else if (i == 4) {
			System.out.println("程式結束");
		}
	}
}