import org.omg.PortableInterceptor.ServerRequestInfo

/**
 *  Created by  gonghuihui55 on 2018/5/9
 *  Groovy 面向对象
 */

class GroovyDemo14 {

    int StudentID;
    String StudentName;

    int Marks1 = 0;
    int Marks2 = 0;
    int Marks3 = 0;

    int total(){
        return  Marks1 + Marks2 + Marks3;
    }

    void setStudentID(int pID){
        StudentID = pID;
    }

    void setStudentName(String pName){
        StudentName = pName;
    }

    int getStudentID(){
        return this.StudentID;
    }

    String getStudentName(){
        return this.StudentName;
    }

    static void main(String[] args){
        GroovyDemo14 st = new GroovyDemo14();
//        st.StudentID = 2018050901;
//        st.StudentName = "肉肉";
        st.setStudentID(2018050901);
        st.setStudentName("肉肉");
        println(st.getStudentID());
        println(st.getStudentName());

        st.Marks1 = 10;
        st.Marks2 = 20;
        st.Marks3 = 30;
        println(st.total());

    }

}
