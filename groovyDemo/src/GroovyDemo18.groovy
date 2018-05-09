/**
 *  Created by  gonghuihui55 on 2018/5/9
 *  泛型、泛型类、特征
 */

class GroovyDemo18 {
    static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("First String");
        list.add("Second String");
        list.add("third String");

//        println(list);
        for (String str : list)
            println(str);

        ListType<String> lstr = new ListType<>();
        lstr.set("hello");
        println(lstr.get());

        ListType<Integer> lint = new ListType<>();
        lint.set(123);
        println(lint.get());

        Student18 st18 = new Student18();
        st18.StudentID = 2018050904;
//        st18.Marks = 18;
        st18.DisplayMarks();
        st18.DisPlayTotal();
    }
}

public class ListType<T> {
    private T localt;

    public T get(){
        return this.localt;
    }

    public T set(T pLoc){
        this.localt = pLoc;
    }

}

interface Total{
    void DisPlayTotal();
}

trait Marks18 implements Total{
    int Marks;
    void DisplayMarks(){
        this.Marks = 18;
        println(this.Marks);
    }

    void DisPlayTotal(){
        println("DisPlay Total");
    }
}

class Student18 implements Marks18 {
    int StudentID;


}