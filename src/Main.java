import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dice dice = new Dice();
		int rollCount;

		System.out.print("주사위의 범위 설정 (예: 1 6)>>");
		dice.range(scan.nextInt(), scan.nextInt());
		
		System.out.print("주사위를 굴릴 횟수 설정>>");
		rollCount = scan.nextInt();
		
		dice.info(rollCount);
		
		for (int i = 0; i < rollCount; i++) {
		dice.roll();
		}
		
		scan.close();
	}
}
