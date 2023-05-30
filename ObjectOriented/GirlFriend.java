package ObjectOriented;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //针对于每一个私有化的成员变量都要提供get和set方法
    //set方法给成员变量赋值
    //get方法，对外提供成员变量的值

    //给成员变量进行赋值
    public void setName(String name) {
        this.name = name;
    }

    //对外提供name属性的
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18&&age<=50){
            this.age=age;
        }else{
            System.out.println("非法参数");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }

    public void method(){
        int age=10;
        System.out.println(age);//就近原则
        System.out.println(this.age);//使用局部变量
    }
}
