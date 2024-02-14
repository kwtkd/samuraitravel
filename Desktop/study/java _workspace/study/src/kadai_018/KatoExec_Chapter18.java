package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		// インスタンスの作成
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		// setGivenNameの実行
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		//execIntroduceの実行
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
		

	}
}
