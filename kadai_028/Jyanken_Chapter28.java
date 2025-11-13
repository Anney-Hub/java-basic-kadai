package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのｒを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
		

		Scanner scanner = new Scanner(System.in);
		
		String meHands;
		while(true) {
			meHands = scanner.nextLine();
	
			switch (meHands) {
				case "r", "s", "p" -> {
//					ループは続かないのでここでscannerクローズ
					scanner.close();
					return meHands;

				}
				default -> {
					System.out.println("正しい値ではありません");
				}
			}
		}			
	}		
	
	public String getRandom() {
		
		String[] arrayHands = {"r", "s", "p"};
		
//		ランダム値の変数iで、配列のインデックスを指定
		int i = (int)(Math.random() * 3);
		String opponentHands = arrayHands[i];
		
//		System.out.println(opponentHands);
		return opponentHands;		
	}
	
	public void playGame() {
		
		HashMap<String,String> handsMap = new HashMap<String,String>();
		
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");

		//変数で整理して比較に使う
		String meChoice = handsMap.get(getMyChoice());
		String enemyChoice = handsMap.get(getRandom());
		
		System.out.println( "自分の手は" + meChoice );
		System.out.println( "対戦相手の手は" + enemyChoice );

		
		if (meChoice.equals(enemyChoice)) {
			System.out.println("あいこです");
		} else if ( (meChoice.equals("グー") && enemyChoice.equals("パー")) ||
				    (meChoice.equals("チョキ") && enemyChoice.equals("グー")) || 
					(meChoice.equals("パー") && enemyChoice.equals("チョキ")) ) {
			System.out.println("自分の負けです");
		} else {
			System.out.println("自分の勝ちです");
		}
		
	}
	
}