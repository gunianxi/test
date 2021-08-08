/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/27 21:56
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        Cat c2=new Cat("加菲猫",5);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();

        Dog d1=new Dog();
        d1.setName("嗷呜");
        d1.setAge(10);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.goukanmen();
    }
}
