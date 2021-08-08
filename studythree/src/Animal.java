import java.util.SplittableRandom;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/27 21:48
 */
public class Animal {
    private String  name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
