public class Dice {

	private int max, min;
	private int diceResult;

	public void range(int min, int max) {
		this.max = max;
		this.min = min;
	}

	public void roll() {
		diceResult = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println(diceResult);
	}

	public void info(int rollCount) {
		System.out.print(min + " ~ " + max + "의 주사위 ");
		System.out.println(rollCount + "번 결과");
	}
	
}