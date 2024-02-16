package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 map = new Dictionary_Chapter21();
		
		// 要素設定
		map.setMap();
		
		// 辞書ないの要素全て表示 
		map.getAll();
		
		// 単語を調べる
	    map.getMap("apple");
	    map.getMap("banana");
	    map.getMap("grape");
	    map.getMap("orange");
	    
	}

}
