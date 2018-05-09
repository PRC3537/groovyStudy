/**
 *  Created by  gonghuihui55 on 2018/5/8
 */

class GroovyDemo7 {
    static void main(String[] args){
        Integer x = 5, y = 10, z = 0;
        int a = 3;
        Double b = 12.34;
        String c = 1024;
        Integer d = 8.6;
        float e = -120.78;

        z = x + y;
        println(z)

        // 返回double类型的x值
        println(x.doubleValue());

        // compareTo()方法, 返回 1，0，-1
        println(x.compareTo(0));

        // equals()方法, 返回true或false
        println(x.equals(y));

        // valueOf()方法, 返回保存所传递的参数的值的相关Number对象   什么情况下使用？
        Integer aNew = Integer.valueOf(a);
        println(aNew);

        Double bNew = Double.valueOf(b);
        println(bNew)

        // toString()方法
        println(x.toString())
        println(Integer.toString(12));

        // parseInt()方法, 将字符串类型的 c转化为16进制Int类型整数
        println(Integer.parseInt(c,16));

        // abs() 方法
        println(Math.abs(d));

        // ceil() 方法 -120.78  ->  -120.0
        println(Math.ceil(e));
        println("ceil: " + Math.ceil(b));

        // floor() 方法 -120.78 -> -121.0
        println("floor: " + Math.floor(b))
        println(Math.floor(e))

        // rint() 方法
        println(Math.rint(b))    //12.78 -> 12   ???
        println(Math.rint(e))


    }
}
