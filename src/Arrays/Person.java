package Arrays;

public class Person {

    private String name;

    //exercise methods:
    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name = name;
    }
    public void sayHello(){

        System.out.println(name);
    }

    public Person(String name) {

        this.name = name;
    }

    public static void main(String[] args) {

//        arrays.Person person1 = new arrays.Person("John");
//        arrays.Person person2 = new arrays.Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //second set of code blocks:
//        arrays.Person person1 = new arrays.Person("John");
//        arrays.Person person2 = person1;
//        System.out.println(person1 == person2);

        //Third set of code blocks:
//        arrays.Person person1 = new arrays.Person("John");
//        arrays.Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

}
