package chapter9;

public class Person {
    private int age;
    private String name;
    private String gender;

    public Person(){
        System.out.println("in Person default constructor");
    }

    public Person(String name){
        System.out.println("in Person 2nd constructor. Name is set.");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
