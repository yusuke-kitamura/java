// パッケージがclassMethodと宣言
package classMethod;

import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 kitamura = new Human02();
		System.out.println("氏名は" + kitamura.name +  "で、年齢は" + kitamura.age + "です");

		Human02 sato = new Human02("佐藤", 25);
		System.out.println("氏名は" + sato.name +  "で、年齢は" + sato.age + "です");
	}
}

