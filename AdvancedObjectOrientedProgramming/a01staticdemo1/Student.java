package AdvancedObjectOrientedProgramming.a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;


    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student(String name, int age, String gender, String teacherName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacherName = teacherName;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    //行为


    /**
     * 获取
     * @return teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置
     * @param teacherName
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name+","+age+","+gender+","+teacherName);
    }

    /*总结：
    * 静态方法中没用this关键字
    * 静态方法中，只能访问静态
    * 非静态方法可以访问所有*/

    //this:表示当前方法调用者的地址值
    //这个this：是由虚拟机赋值的
    public void show1(Student this){
        System.out.println("this："+this);
        System.out.println(this.name+","+this.age+","+teacherName);

        //调用其他方法
        this.show2();
        this.method();
    }

    public void show2(){
        System.out.println("show2");
    }



    public static void method(){
        //System.out.println(name);
        //this.show2();
        System.out.println("静态方法");
    }


}





























