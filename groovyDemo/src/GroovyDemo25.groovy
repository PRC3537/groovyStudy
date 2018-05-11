/**
 *  Created by  gonghuihui55 on 2018/5/10
 *  单元测试
 */
import groovy.util.GroovyTestSuite
import junit.framework.Test
import junit.textui.TestRunner

//class GroovyDemo25 {
//    static void main(String[] args){
//        Student25 student25 = new Student25();
//        student25.name = "zhouchuanxiong";
//        student25.ID = 2018051002;
//        println(student25.Display());
//    }
//
//
//}

public class Student25{
    String name;
    int ID;

    String Display(){
        return name + ID;
    }

}

class Student25Test extends GroovyTestCase {
    void testDisplay() {
        def stu = new Student25(name: "yangguo", ID: 2018051003);
        def expected = "yangguo2018051003";
        assertToString(stu.Display(), expected);
    }
}
//
class EmployeeTest extends GroovyTestCase {
    void testDisplay(){
        println("EmployeeTest");
    }
}

class AllTests{
    static Test suite(){
        def allTests = new GroovyTestSuite();
        allTests.addTestSuite( Student25Test.class )
        allTests.addTestSuite( EmployeeTest.class )
        return allTests
    }

}

TestRunner.run(AllTests.suite());

