package kadai_018;
// 継承
public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	// 抽象メソッド フィールドの値のセット
    public void setGivenName() {
        this.givenName = "太郎";
//        System.out.println("私の名前は" + familyName + givenName + "です。");
    }
	
	// 抽象メソッド　各自の自己紹介
	void eachIntroduce(){
		System.out.println("私はJavaが得意です。");
		System.out.println("");
	}
}