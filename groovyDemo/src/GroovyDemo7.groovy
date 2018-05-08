/**
 *  Created by  gonghuihui55 on 2018/5/8
 */

class GroovyDemo7 {
    static void main(String[] args){
        Integer x = 5, y = 10, z = 0;
        int a = 3;
        Double b = 12.34;

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
    }
}
