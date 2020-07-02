
public class Chapter06 {
	public static void main(String[] args) {
		//2+5を演算して出力
		int val = 2 + 5;
		System.out.println(val);

		//変数valをインクリメント
		System.out.println(++val);

		//変数valに*5
		val = val * 5;
		System.out.println(val);

		//変数boolに「valは50と等しい」を演算した結果を代入して、値を出力
		boolean bool = val == 50;
		System.out.println(bool);

		//変数「bool」に「valは50より小さい AND valを10で割った余りが0」を演算した結果を代入して、値を出力
		bool = val < 50 && val % 10 == 0;
		System.out.println(bool);
	}
}
