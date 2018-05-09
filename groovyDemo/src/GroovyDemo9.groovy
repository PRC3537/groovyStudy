/**
 *  Created by  gonghuihui55 on 2018/5/9
 */

class GroovyDemo9 {
    static void main(String[] args){
        def rint = 1..10;
        def rint1 = 'z'..'a';

        // contains()
        println(rint.contains(2));
        println(rint.contains(11));

        // get()
        println(rint.get(2));
//        println(rint.get(11));      //超出范围

        // getFrom() 获取下限值
        println(rint.getFrom())

        // getTo() 获取上线值
        println(rint.getTo());

        // isReverse()
        println(rint.isReverse());
        println(rint1.isReverse());

        // size()
        println(rint1.size());

        // subList()
        println(rint.subList(1,4));
        println(rint1.subList(1,5));     // [] ???



    }
}
