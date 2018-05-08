/**
 *  Created by  gonghuihui55 on 2018/5/8
 */

class GroovyDemo3 {
    static def DisplayName(){
        println("This is how methods work in groovy");
        println("This is an example of a simple method");
    }

    static void sum(int a = 11, int b = 10){
        int c = a + b;
        println(c);
    }



    static void main(String[] args){
        DisplayName();
        sum(1, 2);
        sum(3);
        sum();
    }
}
