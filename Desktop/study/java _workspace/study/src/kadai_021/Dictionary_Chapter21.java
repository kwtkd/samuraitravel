package kadai_021;
import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	
	//宣言
	public static Map<String, String> map = new HashMap<>();
	
	// メソッド
	public void setMap() {
		map.put("apple", "りんご");
		map.put("peach", "桃");
		map.put("banana", "バナナ");
		map.put("lemon", "レモン");
		map.put("pear", "梨");
		map.put("kiwi", "キウィ");
		map.put("strawberry", "いちご");
		map.put("grape", "ぶどう");
		map.put("muscat", "マスカット");
		map.put("cherry", "さくらんぼ");		
	}
	
//	// クラス内で使われるクラス変数を初期化するstaticイニシャライザを使用する場合
//	static {
//		map.put("apple", "りんご");
//		map.put("peach", "桃");
//		map.put("banana", "バナナ");
//		map.put("lemon", "レモン");
//		map.put("pear", "梨");
//		map.put("kiwi", "キウィ");
//		map.put("strawberry", "いちご");
//		map.put("grape", "ぶどう");
//		map.put("muscat", "マスカット");
//		map.put("cherry", "さくらんぼ");
//	}
	
	// メソッド 辞書内の要素を全て表示
	public void getAll() {
		for(String key : map.keySet()) {
			System.out.println(key + "：" + map.get(key));
		}		
	}
	
	// キーを入力したら対応している値を取得する
	public void getMap(String word) {
		     String japanese =  map.get(word);
		     if(japanese != null){
		    	 System.out.println(word + "の意味は" + japanese + "です。");
		     } else {
		    	 System.out.println(word + "は辞書に存在しません"); 
		     }
	}
	
	
}

