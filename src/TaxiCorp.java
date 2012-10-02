
public class TaxiCorp {
	
	public TaxiDriver pickUp(){
		
		//ドライバーオブジェクト
		TaxiDriver[] drivers = {
			new MasterDriver(),
			new PonkotsuDriver()
		};
		
		//インデックス設定
		int driverIndex;
		if(Math.random() == 1){
			driverIndex = 1;
		}else{
			driverIndex = 0;
		}
		
		return drivers[driverIndex];
	}
}
