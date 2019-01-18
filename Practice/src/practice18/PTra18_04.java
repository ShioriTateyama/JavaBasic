/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
        try( Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv")) ) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                Player player = new Player();

                line.split(",");
                String[] array2 =line.split(",");
                player.setPosition(array2[0]);
                player.setName(array2[1]);
                player.setCountry(array2[2]);
                player.setTeam(array2[3]);

                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);//まずシャッフル
       int gkCount=0;

        for (int i=array.size()-1; 0<=i ;i--) {

        	if(array.get(i).getPosition().equals("GK") && gkCount<1) {

        		gkCount++;
        		System.out.println(array.get(i).toString());

        	}
        }
       int dfCount=0;

        for (int i=array.size()-1; 0<=i ;i--) {

        	if(array.get(i).getPosition().equals("DF")&&dfCount<4) {
        		dfCount++;
        		System.out.println(array.get(i).toString());

        	}
        }

        int mfCount=0;


        for(int i=array.size()-1; 0<=i ;i--) {

        	if(array.get(i).getPosition().equals("MF")&&mfCount<4) {
        		mfCount++;
        		System.out.println(array.get(i).toString());

        	}
        }
        int fwCount=0;

        for (int i=array.size()-1; 0<=i ;i--) {

        	if(array.get(i).getPosition().equals("FW") && fwCount<2) {

        		fwCount++;
        		System.out.println(array.get(i).toString());

        	}
        }

	}
	}

