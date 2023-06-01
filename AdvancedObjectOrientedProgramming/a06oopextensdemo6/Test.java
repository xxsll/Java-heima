package AdvancedObjectOrientedProgramming.a06oopextensdemo6;

public class Test {
    public static void main(String[] args) {

    }
}

class Person{
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }

    public void drink(){
        System.out.println("喝开水");
    }
}

class OverseasStudent extends Person{
    public void Lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();

    }
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
