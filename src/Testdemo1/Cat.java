package Testdemo1;

public class Cat extends Animals{
    public Cat() {
    }

    public Cat(int age, String colour) {
        super(age, colour);
    }

    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColour()+"的猫眯着眼睛侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
