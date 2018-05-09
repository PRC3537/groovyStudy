/**
 *  Created by  gonghuihui55 on 2018/5/9
 *  类继承、抽象类
 */

// 抽象类必须用抽象关键字声明。抽象方法也必须用抽象关键字声明。
abstract class Person {
    public String name;
    public Person(){}
    abstract void DisPlay();    // 抽象方法
}

class Student extends Person{
    int StudentID;
    int Marks;

    public Student(){
        super();
    }
    // 实现父类的抽象方法
    void DisPlay(){
        println(Marks);
    }

}

class Example{
    static void main(String[] args){
        Student st = new Student();
        st.name = "肉肉";
        st.StudentID = 2018050902;
        st.Marks = 10;
        println(st.name);
        println(st.StudentID);
        st.DisPlay();
    }
}
