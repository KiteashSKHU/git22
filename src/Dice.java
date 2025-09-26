public class Dice {

	//프라이빗 변수 선언
	private int max, min;
	private int diceResult;

	public void range(int min, int max) {	//주사위 범위를 전달받아 max, min 변수에 저장
		this.max = max;
		this.min = min;
	}

	public void roll() {	//난수를 생성하여 출력, **Math.floor 기능 활용하여 간소화 구현 필요**
		diceResult = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println(diceResult);
	}

	public void info(int rollCount) {	//Main 클래스로부터 주사위를 굴릴 횟수를 전달받고, 주사위의 모든 정보를 출력
		System.out.print(min + " ~ " + max + "의 주사위 ");
		System.out.println(rollCount + "번 결과");
	}
	
}