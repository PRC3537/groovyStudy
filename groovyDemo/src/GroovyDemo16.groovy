/**
 *  Created by  gonghuihui55 on 2018/5/9
 *  内部类
 */

class GroovyDemo16 {
    String name;
    def callInnerMethod(){
        new Inner().MethodA();
    }

    class Inner{
        def MethodA(){
            println(name);    // 内部类可以访问其封闭类的成员，即使它们是私有的
        }
    }
}

class Example16{
    static void main(String[] args){
        GroovyDemo16 gd16 = new GroovyDemo16();
        gd16.name = "JOE";
        gd16.callInnerMethod();
    }
}
