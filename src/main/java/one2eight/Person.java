package one2eight;
//Create a Class called Person with two properties/fields/instance-variables called name and age.
//
//    Make sure you apply ENCAPSULATION to the ivar.
//    In main Inside main (psvm)..do the following:
//    Create a Person object/reference variable using a constructor.
//    Then attempt to set their age to -10.
//    Right after that..go ahead get their age with your getter method and print it out the result.
//    If you encapsulated correctly.. then setting the age in main to a negative number should not affect the person's age
//    Hint/Logic:
//    When you construct your Person object in main with age of say 19..then you tried to set their age to say -10..their age should still be 19!
public class Person {
    private String name;
    private  int age;

    public Person(String name, int age){
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
        this.age = -10;
    }

    public  static String sayName() {
        return "Yjoltetepique";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
