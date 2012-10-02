
public class PonkotsuDriver extends TaxiDriver{

	@Override
	public void checkAround(){
		System.out.println("前方OK、発進だ");
		System.out.println("おっとシートベルト忘れてた");
	}
	
	@Override
	public void kickAccel(){
		System.out.println("いけいけどんどん！");
	}

	@Override
	public void startEngin() {
		
	}

	@Override
	public void handlling(TrafficSignal color) {
		if(color == TrafficSignal.RED){
			System.out.println("赤信号だ止まろう");
		}else if(color == TrafficSignal.YELLOW){
			System.out.println("いける、加速しよう。");
		}else if(color == TrafficSignal.BLUE){
			System.out.println("青だ、よし発進しよう。");
		}
	}
}
