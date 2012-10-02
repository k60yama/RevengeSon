
public class MyLife {

	public static void main(String[] args) {
		//Personクラスのインスタンス生成
		Person me = new Person("俺様");
		
		//TaxiCorpインスタンス生成
		TaxiCorp company = new TaxiCorp();
		
		//2回呼び出し
		for(int i=0; i<2; i++){
			//TaxiDriverインスタンス取得
			TaxiDriver driver = company.pickUp(i);
			
			//タクシー乗車
			driver.ride(me.getName());
			driver.start();
				
			//信号
			TrafficSignal[] colors = TrafficSignal.values();
			for(int j = 0; j < colors.length; j++){
				driver.handlling(colors[j]);
			}
		}
	}
}
