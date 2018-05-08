/**
 *  Created by  gonghuihui55 on 2018/5/8
 */
import java.io.File

class GroovyDemo6 {
    static void main(String[] args){
        new File("src/filedemo6").eachLine{
            line -> println("line : $line");
        }

        //如果要将文件的整个内容作为字符串获取，可以使用文件类的text属性。以下示例显示如何完成此操作
        File file = new File("src/filedemo6");
        println file.text;
        println "The file ${file.absolutePath} has ${file.length()} bytes"


        //写文件
       /* new File("src/writefiledemo6.txt").withWriter('utf-8') {
            writer -> writer.writeLine("hello world!!!");
        }*/
    }

}
