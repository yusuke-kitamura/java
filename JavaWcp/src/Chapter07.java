
public class Chapter07 {
	public static void main (String[] args) {
		int lunchMoney = 900;
		if (lunchMoney >= 800) {
			System.out.println("チャーシューラーメンを食べれます");
		}
		else if (lunchMoney > 600) {
			System.out.println("ラーメンを食べれます");
		}
		else {
			System.out.println("どれも食べれません");
		}
	}
}
