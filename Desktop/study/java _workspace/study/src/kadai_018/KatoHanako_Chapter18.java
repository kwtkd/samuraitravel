package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	
	// 抽象メソッド フィールドの値のセット
    public void setGivenName() {
        this.givenName = "花子";
//        System.out.println("私の名前は" + familyName + givenName + "です。");
    }
	
	// 抽象メソッド　各自の自己紹介
	void eachIntroduce(){
		System.out.println("趣味は読書です。");
		System.out.println("");
	}
}
