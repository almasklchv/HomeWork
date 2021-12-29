public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "default";
    }

    // getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // setter
    public void setName(String n) {
        name = n;
    }
    public void setAge(int n) {
        age = n;
    }

    public String hello() {
        return "Hello, my name is " + name +
                ", I'm " + age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void birthday() {
        age++;
    }
}
