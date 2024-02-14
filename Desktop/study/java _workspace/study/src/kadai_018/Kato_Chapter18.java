package kadai_018;

//親クラス
abstract public class Kato_Chapter18 {
	
	// フィールド宣言
	public  String familyName = "加藤";
	public  String givenName = "";
	public  String address = "東京都中野区〇×";
	
	// メソッド　共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println( "私の名前は" + familyName + givenName + "です。" );
		System.out.println("住所は" + address + "です。" );
	}
	
	// 抽象メソッド　個別の自己紹介
	abstract void eachIntroduce();
	// 抽象メソッド　フィールドの値のセット
	abstract void setGivenName();
	
	
	// メソッド　紹介を実行する
	public void execIntroduce() {
		System.out.println( "私の名前は" + familyName + givenName + "です。" );
		System.out.println("住所は" + address + "です。" );
		eachIntroduce();
	}	
}
