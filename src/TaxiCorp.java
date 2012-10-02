
public class TaxiCorp {
	
	public TaxiDriver pickUp(Integer index){
		
		//ドライバーを配列化
		TaxiDriver[] drivers = {
			new MasterDriver(),
			new PonkotsuDriver()
		};
		
		return drivers[index];
		/*
		//インデックス設定
		int driverIndex;
		if(Math.random() == 1){
			driverIndex = 1;
		}else{
			driverIndex = 0;
		}
		
		return drivers[driverIndex];
		*/
	}
	
}
