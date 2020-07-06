package highandlow;

import java.util.Scanner;

public class HighAndLow {
	public static void main(String[] args) {
		//scannerクラス
		Scanner sc = new Scanner(System.in);
		//勝った場合、繰り返し
		while(true){
		//0.0以上1.0未満の実数を生成し、*9をすることで0.0以上9.0未満の実数を生成
		//+1で0を消し、1~9に範囲を指定
		int leftcard = (int)(Math.random()*9)+1;
		int rightcard = (int)(Math.random()*9)+1;

		System.out.println("**************");
		System.out.println("* High & Low *");
		System.out.println("**************");

		System.out.println("  [問題表示] ");
		System.out.println("* * *   * * *");
		System.out.println("* " + leftcard + " *   * ? *");
		System.out.println("* * *   * * *");
		System.out.print("High  or  Low ?(h/l)");
		//入力値を読み込み
		String answer = sc.nextLine();

		if(answer.equals("h")) {
			System.out.println("Highを選択しました");
		}else {
			System.out.println("Lowを選択しました");
		}

		System.out.println("  [結果表示] ");
		System.out.println("* * *   * * *");
		System.out.println("* "+leftcard+" *   * "+rightcard+" *");
		System.out.println("* * *   * * *");

		String result;

		if (leftcard < rightcard) {
			result = "h";
		}else if(leftcard > rightcard){
			result = "l";
		}else {
			result = answer;
		}

		if(answer.equals(result)){
			System.out.println("You win!!!");
		}else{
			System.out.println("You lose...");
			break;
		}
		}
		System.out.println("ゲーム終了");
	}
}
