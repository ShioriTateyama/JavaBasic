/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		java.lang.Boolean b1 = new java.lang.Boolean(b);
		java.lang.Byte by1= new java.lang.Byte(by);
		java.lang.Short s1= new java.lang.Short(s);
		java.lang.Character c1 = new java.lang.Character(c);
		java.lang.Integer i1 = new java.lang.Integer(i);
		java.lang.Long l1 = new java.lang.Long(l);
		java.lang.Float f1 =new java.lang.Float(f);
		java.lang.Double d1 =new java.lang.Double(d);

		System.out.println(b1);
		System.out.println(by1);
		System.out.println(s1);
		System.out.println(c1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);


	}
}
