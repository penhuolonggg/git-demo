package Testdemo1;

public class Animals {
    private int age;
    private String colour;

    public Animals() {
    }

    public Animals(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void eat(String something){
        System.out.println("动物在吃"+something);
    }
}
