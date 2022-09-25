package animalclass;

/*
 * An Animal super class
 * This class can be extended or an interface of it can be created
 */
public class Animal
{
    //properties
    public String name;
    public double weight;
    public int age;

    //access modifiers
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
