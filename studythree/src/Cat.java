/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/27 21:53
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
