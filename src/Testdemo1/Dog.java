package Testdemo1;

public class Dog extends Animals {
    public Dog() {
    }

    public Dog(int age, String colour) {
        super(age, colour);
    }

    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColour()+"的狗两只前腿死死的抱住"+something+"猛吃");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }

}
