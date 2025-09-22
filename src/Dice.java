import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dice = 0;
		int a = 0;
		int b = 0;
		int c = 0;

		System.out.print("주사위의 최솟값 설정>>");
		a = scan.nextInt();

		System.out.print("주사위의 최댓값 설정>>");
		b = scan.nextInt();
		
		System.out.print("주사위를 굴릴 횟수 설정>>");
		c = scan.nextInt();

		for(int i = c; i > 0; i--) {
		dice = (int) (Math.random() * (b - a + 1)) + a;
		System.out.print(dice + ", ");
		}
		
		scan.close();
	}
}
