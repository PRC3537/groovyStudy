/**
 *  Created by  gonghuihui55 on 2018/5/10
 *  注释，不知道怎么用ß
 */

/*

class GroovyDemo20 {
    static void main(String[] args){
        println("*" * 20);
    }

}
*/



// 字符串类型
@ interface Simple {
    String str19() default "hello world!!!"
}

// 枚举类型
enum DayOfWeek { mon, tue, wed, thu, fri, sat, sun }
@ interface Scheduled {
    DayOfWeek dayOfWeek ()
}

// 类类型
@ interface Simple1 {}
@ Simple1
class User {
    String userName;
    int age;
}

def user = new User(userName: "Tom", age: 10);
println(user.age);
println(user.userName);

// 使用注释时，需要至少设置所有没有默认值的成员
@ interface Simple2 {
    int status()
}

@ Simple2(status = 2)

// 关闭注释参数
@ interface OnlyIf {
    Class value();
}

@ OnlyIf({ number <= 6 })
void Version6(){
    result << 'Number greater than 6'
}

@ OnlyIf({ number >= 6 })
void Version7(){
    result << 'Number greater than 6'
}


// 怎么用还不是很清楚

