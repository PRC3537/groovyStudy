/**
 *  Created by  gonghuihui55 on 2018/5/10
 *  json 解析
 */
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class GroovyDemo22 {
    static void main(String[] args){
        def jsonSlurper = new JsonSlurper();
        def object = jsonSlurper.parseText('{"name" : "Tom", "age" : "5"}');

        println(object.name);
        println(object.age);

        Object lst = jsonSlurper.parseText('{"List" : [1, 2, 3, 4, 5] }');
        lst.each {
            println(it)
        }

        def obj = jsonSlurper.parseText ''' {"Integer": 12, "fraction": 12.55, "double": 12e13}'''
        println(obj.Integer);
        println(obj.fraction);
        println(obj.double);

        def output = JsonOutput.toJson([new Student22(StudentName: "Lily", age: 10),
        new Student22(StudentName: "Jonh", age: 20)]);
        println(output);

    }
}

class Student22 {
    String StudentName;
    int age;
}