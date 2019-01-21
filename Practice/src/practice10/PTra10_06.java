package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Scanner scanner = new Scanner(System.in);
		Car [] cars=new Car[3];

		for(int i=0; i<cars.length;i++) {
			System.out.println("------------------------------------");
			System.out.println((i + 1) + "台目");

			cars[i]=new Car();
			System.out.println("シリアル№、車体カラー、ガソリン量をカンマ区切りで入力してください");
			String line = scanner.nextLine();

			String[] info = line.split(",");

			cars[i].serialNo=Integer.parseInt(info[0]);
			cars[i].color=info[1];
			cars[i].gasoline=Integer.parseInt(info[2]);

		}

		final int distance =200;
		int[] count = new int[cars.length];

		for(int i = 0; i < cars.length; i++) {
			int sum=0;


			while(distance-sum>0) {
				int run = cars[i].run();    //戻り値を設定した
				if(run==-1) {
					count[i]=-1;
					break;
				}


			sum +=run;
			count[i]++;  //一回ずつ実行されることを＋１で設定
			System.out.println(sum);
			}
		}


			for (int i = 0; i< count.length; i++) {
				if (count[i]==-1) {
					System.out.println((i + 1) + "台目は目的地に到達できませんでした");
				}else {
					System.out.println((i+1)+"台目の車、目的地にまで" + count[i] +"時間かかりました。残りのガソリンは、"+ cars[i].gasoline +"リットルです");

				}
			}

		}
}


//		Car car1 = new Car();
//		Car car2 = new Car();
//		Car car3 = new Car();
//
//		car1.color="red";
//		car1.gasoline=10;
//
//		car2.color="blue";
//		car2.gasoline=20;
//
//		car3.color="pink";
//		car3.gasoline=30;
//
//		int distance =100;
//
//			int sum1=0;  //走った距離の合計
//			int count1=0;
//			while(true) {           //Car.javaでは繰り返されないので繰り返しをする
//
//				int run1 = car1.run();    //戻り値を設定した
//				count1++;  //一回ずつ実行されることを＋１で設定
//
//				if(run1==-1) {
//					System.out.println("目的地に到達できませんでした");
//					break;
//				}
//				sum1 +=run1;
//				System.out.println(sum1);
//
//				if (sum1>distance) {
//					System.out.println("目的地にまで" + count1 +"時間かかりました。残りのガソリンは、"+ car1.gasoline +"リットルです");
//					break;
//				}
//			}
//
//			int sum2=0;  //走った距離の合計
//			int count2=0;
//			while(true) {           //Car.javaでは繰り返されないので繰り返しをする
//
//				int run2 = car2.run();    //戻り値を設定した
//				count2++;  //一回ずつ実行されることを＋１で設定
//
//
//					if(run2==-1) {
//						System.out.println("目的地に到達できませんでした");
//						break;
//					}
//					sum1 +=run2;
//					System.out.println(sum2);
//
//					if (sum1>distance) {
//						System.out.println("目的地にまで" + count2 +"時間かかりました。残りのガソリンは、"+ car2.gasoline +"リットルです");
//						break;
//					}
//			}
//
//			int sum3=0;  //走った距離の合計
//			int count3=0;
//			while(true) {           //Car.javaでは繰り返されないので繰り返しをする
//
//				int run3 = car3.run();    //戻り値を設定した
//				count3++;  //一回ずつ実行されることを＋１で設定
//
//
//					if(run3==-1) {
//						System.out.println("目的地に到達できませんでした");
//						break;
//					}
//					sum3 +=run3;
//					System.out.println(sum3);
//
//					if (sum3>distance) {
//						System.out.println("目的地にまで" + count3 +"時間かかりました。残りのガソリンは、"+ car3.gasoline +"リットルです");
//						break;
//					}
//			}


