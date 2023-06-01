package AdvancedObjectOrientedProgramming.a02oopextensdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z=new Zi();
        System.out.println(z);
        z.name="aa";
        z.age=23;
        System.out.println(z.name);

    }
}

class Fu{
    String name;
    int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{

}
