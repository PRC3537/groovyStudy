/**
 *  Created by  gonghuihui55 on 2018/5/10
 */

import groovy.json.JsonBuilder
import groovy.swing.SwingBuilder

import javax.security.auth.Subject
import javax.swing.*

//class GroovyDemo24 {
// Swing 构建器
/*def myapp = new SwingBuilder();

def myframe = myapp.frame( title : 'hello', location : [200, 200],
size : [400, 300], defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE){
    label(text : 'Hello World')
    }
myframe.setVisible(true)*/

//}

// JsonBuilder

def builder = new JsonBuilder();
class Student24 {
    String studentName;
}
def studentlist = [new Student24(studentName: "gugu"), new Student24(studentName: "guoer"),
                   new Student24(studentName: "hongqigong")];
builder studentlist, { Student24 student -> name student.studentName}
println(builder)
def root = builder.students{
    student {
        studentName  'Jonh';
        studentID  20180510;

        Marks24(
                Subject1 : 90,
                Subject2 : 91,
                Subject3 : 92
        )
    }

}
println(builder.toString());

def lst = builder([1, 2, 3]);
println(builder.toString())

