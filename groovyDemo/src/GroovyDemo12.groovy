/**
 *  Created by  gonghuihui55 on 2018/5/9
 */

class GroovyDemo12 {
    static void main(String[] args){
        Date date = new Date(100);      // 100是什么意思？？？
        Date date1 = new Date("09/05/2018");
        Date date2 = new Date("09/05/2018");

        println(date.toString());

        // after()
        println(date.after(date1));
        println(date2.after(date1));

        //before()

        // equals()
        println(date1.equals(date2));
        println(date.equals(date1));

        // compareTo()  返回 >0,  0, <0
        // getTime()
        println(date.getTime());
        println(date1.getTime());

        //setTime()
        date.setTime(10000);
        date1.setTime(10000);
        date2.setTime(10000);

        println(date.toString())
        println(date1.toString())
        println(date2.toString())


    }
}
