
public class TaxiCorp {
	
	public TaxiDriver pickUp(){
		
		//�h���C�o�[�I�u�W�F�N�g
		TaxiDriver[] drivers = {
			new MasterDriver(),
			new PonkotsuDriver()
		};
		
		//�C���f�b�N�X�ݒ�
		int driverIndex;
		if(Math.random() == 1){
			driverIndex = 1;
		}else{
			driverIndex = 0;
		}
		
		return drivers[driverIndex];
	}
}
