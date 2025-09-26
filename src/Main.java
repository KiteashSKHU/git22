import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dice dice = new Dice(); //주사위 dice 객체 생성
		int rollCount;	//굴릴 횟수 저장

		System.out.print("주사위의 범위 설정 (예: 1 6)>>");
		dice.range(scan.nextInt(), scan.nextInt());	//주사위의 범위 입력받음
		
		System.out.print("주사위를 굴릴 횟수 설정>>");
		rollCount = scan.nextInt();	//주사위를 굴릴 횟수 입력받아 rollCount 변수에 저장
		
		dice.info(rollCount);	//주사위 정보 출력 메소드에 굴리는 횟수 인자 전달
		
		for (int i = 0; i < rollCount; i++) { //rollCount 횟수 만큼 반복, roll 메소드 실행
		dice.roll();
		}
		
		scan.close();
	}
}
