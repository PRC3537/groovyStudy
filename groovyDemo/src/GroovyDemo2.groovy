/**
 *  Created by  gonghuihui55 on 2018/5/8
 */

class GroovyDemo2 {
    static void main(String[] args){
        int x = 5;
        int X = 6;

        println("The value x is " + x + " The value X is " + X);

        def range = 5..10;
        println(range);
        println(range.get(2));
    }

}
