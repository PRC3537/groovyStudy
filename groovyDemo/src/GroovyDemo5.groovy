/**
 *  Created by  gonghuihui55 on 2018/5/8
 */

class GroovyDemo5 {
    static int x = 100;

    /*public static getX(){
        //局部变量
        int xl = 200;
        println(xl);
        return x;
    }*/

    public static getX(){
        //x = 200;  与 this.x = 200;  得到的结果一样，两者有什么区别？？？
        this.x = 200
        //x = 200;
        return x;
    }

    static void main(String[] args){
        GroovyDemo5 gr5 = new GroovyDemo5();
        println gr5.getX();
    }
}
