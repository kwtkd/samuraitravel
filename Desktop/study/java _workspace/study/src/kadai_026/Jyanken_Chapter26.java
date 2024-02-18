package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	//自分のジャンケンのメソッド
	public String getMyChoice() {
		// Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		// 入力された内容を取得する
		String myChoice = scanner.next();
		// rspのどれかに該当すれば戻り値に渡す
		if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
		// その他の文字が入力されれば空白を返し、メッセージを表示
		} else { 
			System.out.println("正しい値を入力してください。");
		}
		scanner.close();
		return myChoice;
		
	}
	
	// 対戦相手のジャンケンのメソッド
	public String getRandom() {
		// ジャンケンの配列を用意しておく
		String[] jyankenArray = {"r", "s", "p"};
		// floorで整数に切り下げても方はdoubleなのでintでキャスト
		int indexNum = (int)(Math.floor(Math.random() * 3 ));
		// 乱数を配列のインデックスとして使用する
		return jyankenArray[indexNum];
	}
	
	// ジャンケンをして、結果を表示するメソッド
	public void playGame() {
		// HashMapの作成
		Map<String, String> map = new HashMap<>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		
		//　mapから対応する値　自分と対戦相手のジャンケンの手を取得・表示する
		String myChoice = getMyChoice();
		String randomChoice = getRandom();
		System.out.println("自分の手は" + map.get(myChoice) + ", 対戦相手の手は" + map.get(randomChoice));

		
		// 勝敗を決める
		if(myChoice.equals("r")){
			switch(randomChoice) {
			case "r":
				System.out.println("あいこです");
				break;
			case "s":
				System.out.println("自分の勝ちです");
				break;
			case "p":
				System.out.println("自分の負けです");
				break;
			}
		}
		if(myChoice.equals("s")){
			switch(randomChoice) {
			case "r":
				System.out.println("自分の負けです");
				break;
			case "s":
				System.out.println("あいこです");
				break;
			case "p":
				System.out.println("自分の勝ちです");
				break;
			}
		}
		if(myChoice.equals("p")){
			switch(randomChoice) {
			case "r":
				System.out.println("自分の勝ちです");
				break;
			case "s":
				System.out.println("自分の負けです");
				break;
			case "p":
				System.out.println("あいこです");
				break;
			}
		}
	}
}
