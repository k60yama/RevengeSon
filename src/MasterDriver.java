
public class MasterDriver extends TaxiDriver{

	@Override
	public void startEngin(){
		
	}
	
	@Override
	public void checkAround(){
		System.out.println("バックミラーOK");
		System.out.println("シートベルトOK");
		System.out.println("前方OK");
		System.out.println("後方OK");
		System.out.println("前方OK");
	}
	
	@Override
	public void kickAccel(){
		System.out.println("慎重にしよう");
	}

	@Override
	public void handlling(TrafficSignal color) {
		if(color == TrafficSignal.RED){
			System.out.println("赤信号だ止まろう");
		}else if(color == TrafficSignal.YELLOW){
			System.out.println("黄色だから危ないから、止まろう");
		}else if(color == TrafficSignal.BLUE){
			System.out.println("青だ、よし発進しよう。");
		}		
	}
}
