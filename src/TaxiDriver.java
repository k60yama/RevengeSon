
public abstract class TaxiDriver {

	/*
	//信号の色
	public static final String RED = "赤色";
	public static final String YELLOW = "黄色";
	public static final String BLUE = "青色";
	*/
	
	//タクシー乗車
	public void ride(String name){
		//コンソール出力
		System.out.println(name + "さん乗車しました。");
	}
	
	//通常メソッドと判別するためにabstractをつけなければいけない
	public abstract void startEngin();
	public abstract void checkAround();
	public abstract void kickAccel();
	public abstract void handlling(TrafficSignal color);
	
	/*
	//エンジンをかける
	public void startEngin(){
			
	}
		
	//周囲確認する
	public void checkAround(){
			
	}
		
	//アクセルを踏む
	public void kickAccel(){
			
	}
	*/
	
	public void start(){
		this.startEngin();
		this.checkAround();
		this.kickAccel();
	}
}
