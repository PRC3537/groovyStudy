/**
 *  Created by  gonghuihui55 on 2018/5/11
 *  元对象编程
 */

class GroovyDemo26 {
    static void main(String[] args){
        Student26 student26 = new Student26();
        student26.studentName = "Jeo";
        student26.studentID = 20180511;

        println(student26.studentName);
        println(student26.studentID);
        student26.addMarks();        // 缺失方法

        Teacher26 teacher26 = new Teacher26();
        println(teacher26.name);
        teacher26.metaClass.setAttribute(teacher26, 'name', 'hao');
        println(teacher26.getName());
    }

}

class Student26 implements GroovyInterceptable{
    protected dynamicProps = [ : ];

    void setProperty(String pName, val){
        dynamicProps[pName] = val;
    }

    def getProperty(String pName){
        dynamicProps[pName] = pName;

    }

    def invokeMethod(String Name, Object args){
        return "called invokeMethod $Name $args"
    }

    def methodMissing(String name, def args){
        println("Missing method");    // 并没有被调用到，why???
    }
}

class Teacher26 {
    private String name = "Gao";

    public String getName(){
        return this.name;
    }
}
