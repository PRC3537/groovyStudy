/**
 *  Created by  gonghuihui55 on 2018/5/9
 */

class GroovyDemo8 {
    static void  main(String[] args){
        String sample = "hello world!!!"
        String sample1 = "Hello World!!!"
        String sample2 = "HELLO WORLD"
        String sample3 = sample.concat(sample2)

        println(sample[4])
        println(sample[-1])
        println(sample[1..2])   //  el
        println(sample[4..2])   //  oll
        println("*" * 20)    // 字符串重复
        println(sample.length())

        // center()  方法
        println(sample.center(30))   // 两边有空格补充

        // compareToIgoreCase() 方法
        println(sample.compareToIgnoreCase(sample1))    // 0  长度相等
        println(sample1.compareToIgnoreCase(sample2))   // 3
        println(sample2.compareToIgnoreCase(sample))    // -3

        // equalsIgnoreCase() 方法
        println("equalsIgnoreCase: " + sample.equalsIgnoreCase(sample1))   // true
        println("equalsIgnoreCase: " + sample.equalsIgnoreCase(sample2))   // false
        println("equalsIgnoreCase: " + sample.equalsIgnoreCase(sample3))   // false

        // concat() 方法
        println(sample3)

        // eachMatch() 方法
        sample.eachMatch("."){
            ch -> println ch
        }

        // endWith() 方法
        println(sample.endsWith("!!!"))
        println(sample2.endsWith("!!!"))

        // getAt()
        println(sample1.getAt(2))

        // indexOf()
        println(sample.indexOf("l"))

        println(sample.indexOf('o',8))   // -1

        println(sample.indexOf('el'))
        println(sample.indexOf('od'))   // -1

        // matches()
        println(sample.matches("hello"))      // false
        println(sample.matches("hello(.*)"))  // true

        // minus()
        println(sample.minus("hello"))

        // next()
        println("next: " +sample2.next())  // HELLO WORLE  D next-> E

        // previous()
        println("previous:" + sample2.previous())   // HELLO WORLE  D previous-> C

        // padLeft()
        println(sample.padLeft(20))
        println(sample.padLeft(20,"*"))

        // plus()
        println(sample.plus("again"))

        // replaceAll()
        println(sample.replaceAll("hello","hi"))

        // reverse()
        println(sample.reverse())

        // split()
        String[] str
        str = sample.split(' ')
        for (String values : str)     // ***
            println(values)

        // subString()
        println(sample.substring(2));
        println(sample.substring(2,9));

        // toUpperCase()
        println(sample.toUpperCase())

        // toLowerCase()
        println(sample2.toLowerCase())

    }
}
