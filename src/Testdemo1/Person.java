package Testdemo1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =  name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animals  animals,String something){
        if(animals instanceof Dog){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animals.getColour()+"的"+animals.getAge()+"岁的狗");
            animals.eat(something);
        } else if (animals instanceof Cat) {
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animals.getColour()+"的"+animals.getAge()+"岁的猫");
            animals.eat(something);
        }

    }

}
