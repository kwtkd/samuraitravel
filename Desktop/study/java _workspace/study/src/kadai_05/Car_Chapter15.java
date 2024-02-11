package kadai_05;

public class Car_Chapter15 {
	// フィールドの宣言
	private int gear  = 1; // ギアの初期値1
	private int speed = 10; //スピードの初期値1

	// コンストラクタ
	public Car_Chapter15( int gear, int speed) {
		this.gear  = gear;
		this.speed = speed;	
	}
	
	//  ギアを表すメソッド
	public void gearChange( int afterGear ){
		int beforeGear = gear;
		gear = afterGear;
		System.out.println("ギア" + beforeGear + "から" + gear + "に切り替えました");
	}
	
	// ギアチェンジ後の速度を表すメソッド
	public void run () {
		switch(gear) {
		case 1 -> System.out.println("速度は時速10kmです");
		case 2 -> System.out.println("速度は時速20kmです");			
		case 3 -> System.out.println("速度は時速30kmです");	
		case 4 -> System.out.println("速度は時速40kmです");		
		case 5 -> System.out.println("速度は時速50kmです");
		default -> System.out.println("速度は時速10kmです");
		}
		
	}	
}