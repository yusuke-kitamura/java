package capsule.human;

//publicのアクセス修飾子のため外部から参照が可能
public class HumanNoCapsule {
	public String name;
	public int age;

	public HumanNoCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
