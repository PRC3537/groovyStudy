/**
 *  Created by  gonghuihui55 on 2018/5/9
 *  闭包
 */

class GroovyDemo19 {
    static void main(String[] args){
        def clos = {println("hello world");}
        clos.call()

        def clos1 = {param -> println("hello ${param}");}
        clos1.call("world!")

        def str19 = "hello";
        def clos2 = {param1 -> println("${str19} ${param1}")}
        clos2.call("world!!")
        Example19.Display(clos2);

        def mp19 = ["TopicName" : "Maps", "TopicDescrition" : "Methods in Maps"];
        mp19.each {println it}
        mp19.each {println "${it.key} maps to : ${it.value}"}

        def lst = [1,2,3,4]
        def value;
        lst.each {println(it)}
        println("偶数")
        lst.each {num -> if(num % 2 == 0) println(num)}

        value = lst.find{element -> element > 2};    // find()  返回第一个值
        println(value);
    }
}

class Example19 {
    def static Display(clo){
        clo.call("Inner");
    }
}