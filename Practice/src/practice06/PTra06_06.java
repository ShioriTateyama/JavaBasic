package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

		for(int k=1; k<6; k++){
			for(int i=1; i<=k-1; i++){
				System.out.print("■");
			}

			for(int s=1; s<=6-k; s++){
				System.out.print("□");
			}

		System.out.println();

			}
		}
}

