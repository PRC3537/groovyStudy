/**
 *  Created by  gonghuihui55 on 2018/5/9
 */

class GroovyDemo10 {
    static void main(String[] args){
        def lst = [11, 10, 8, 14];
        def emptylst = [];
        def newlst = [];

        println(lst);

        // add()
        lst.add(15);
        println(lst);

        lst.add(2,12);
        println(lst);

        // contains()
        println lst.contains(11);
        println lst.contains(18);

        // isEmpty()
        // minus()
        newlst = lst.minus([12,13]);
        println(newlst);

        // plus()
        newlst = lst.plus([17,18]);
        println(newlst);

        //pop()
        newlst = newlst.pop()
        println(newlst);      // 返回删除元素，18

        // remove()
        println(lst.remove(1));   // 12
        println(lst)

        // reverse()
        // size()
        // sort()
        println(lst.sort());

    }
}
