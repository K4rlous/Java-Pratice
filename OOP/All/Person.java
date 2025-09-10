package All;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
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
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }
}
