package Arrays;


public class ArrayExercises {
    public static void main(String[] args) {
//  What happens when you run the following code?
//  Will output the hex hash code (unique id number allocated to an object by JVM. Through this hash code only the object is referenced.It is Hexadecimal form).
//  Why is Arrays.toString necessary?
//  The method returns a string representation of the contents of the specified int array.
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


// Create an array that holds 3 arrays.Person objects. Assign a new instance of the arrays.Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] peopleArray = new Person[3];
//Fill array with people:
        peopleArray[0] = new Person("Johnny");
        peopleArray[1] = new Person("Chris");
        peopleArray[2] = new Person("Stevo");

        for (Person person : peopleArray) {
            System.out.println(person.getName());
        }

        peopleArray = addPerson(peopleArray, new Person("Ashley"));
        for (Person person : peopleArray) {
            System.out.println(person.getName());
        }
    }

    public static Person [] addPerson(Person[] peopleArray, Person person) {
        Person[] newArray = new Person[peopleArray.length + 1];

        for (int i = 0; i < newArray.length; i++) {

            if (i == newArray.length - 1) {
                newArray[i] = person;
            } else {
                newArray[i] = peopleArray[i];
            }
        }
        return newArray;
    }
}
