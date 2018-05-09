/**
 *  Created by  gonghuihui55 on 2018/5/9
 *  接口
 */

class GroovyDemo17 {
    static void main(String[] args){
        StudentImp st = new StudentImp();
        st.StudentID = 2018050903;
        st.Marks = 10;
        st.DisplayMarks();
    }

}

interface Marks{
    void DisplayMarks();
}

class StudentImp implements Marks{
    int StudentID;
    int Marks;

    @Override
    void DisplayMarks() {
        println(Marks);

    }
}