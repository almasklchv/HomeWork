import java.util.*;

public class test {
    public static void main(String[] args) {
        // ООП - объектно-ориентированное программирование
        // int double boolean char String

        // объект класса, экземпляр, instance

        Person p1 = new Person();
        p1.setName("qwe");
        p1.setAge(17);

        Person p2 = new Person();
        p2.setName("asd");
        p2.setAge(18);

        System.out.println(p1.hello());
        System.out.println(p1.isAdult());

        p1.birthday();

        System.out.println(p1.hello());
        System.out.println(p1.isAdult());
    }
}