import dogclass.Dog;
/**
 * Java Program to demonstrate what two separate classes (Animal and Dog) in separate packages.
 * With the class members (attributes and methods)
 * and access modifiers.
 * Class Dog has access to members (attributes and methods) of class Animal
 *
 * @author Kgotso Matjato
 */

public class Main
{
    public static void main(String[] args)
    {
        //dog  object
        Dog myDog = new Dog();

        myDog.setName("Clover");
        myDog.setWeight(75.5);
        myDog.setAge(15);

        System.out.println(myDog.name);
        System.out.println(myDog.weight);
        System.out.println(myDog.age);
    }

}