package Testdemo1;

public class Test {
    public static void main(String[] args) {
        Person person =new Person("老王",30);

        Animals animal1=new Dog(2,"white");
        person.keepPet(animal1,"骨头");

        Animals animal2=new Cat(77,"green");
        person.keepPet(animal2,"🐟");

    }
}
