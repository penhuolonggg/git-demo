package Testdemo1;

public class Test {
    public static void main(String[] args) {
        Person person =new Person();
        person.setName("mr.wang");
        person.setAge(30);

        Animals animal1=new Dog();
        animal1.setAge(2);
        animal1.setColour("白色");
        person.keepPet(animal1,"骨头");

        Animals animal2=new Cat();
        animal2.setAge(77);
        animal2.setColour("绿色");
        person.keepPet(animal2,"🐟");

    }
}
