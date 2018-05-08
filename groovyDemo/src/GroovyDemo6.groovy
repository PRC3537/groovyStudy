/**
 *  Created by  gonghuihui55 on 2018/5/8
 */
import java.io.File

class GroovyDemo6 {
    static void main(String[] args){
        // 新建目录
        def directory = new File('src/Directory');
        //directory.delete();
        directory.mkdir();

        // 读文件
        new File("src/Directory/filedemo6").eachLine{
            line -> println("line : $line");
        }

        //如果要将文件的整个内容作为字符串获取，可以使用文件类的text属性。以下示例显示如何完成此操作
        File file = new File("src/Directory/filedemo6");
        println file.text;
        println "The file ${file.absolutePath} has ${file.length()} bytes"
        println "File? ${file.isFile()}"
        println "Directory? ${file.isDirectory()}"

        // 复制文件
        def fileCopy = new File("src/Directory/fileCopy");
        fileCopy << file.text;

        //获取目录文件, 根据机器上可用的驱动器，输出可能会有所不同。
        def rootFiles = new File("test").listRoots();
        rootFiles.each {
            file1 -> println "file1 " + file1.absolutePath
        }

        // 使用File类的eachFile函数列出特定目录中的文件
        new File("/Users/gonghuihui55/IdeaProjects/groovyStudy/groovyDemo/src/Directory").eachFile {
            file2 -> println "file2 " + file2.getAbsolutePath()
        }

        // 递归显示目录及其子目录中的所有文件
        new File("/Users/gonghuihui55/IdeaProjects/groovyStudy/groovyDemo/src/").eachFileRecurse {
            file3 -> println "file3 " + file3.getAbsolutePath()
        }

        //写文件
       /* new File("src/writefiledemo6.txt").withWriter('utf-8') {
            writer -> writer.writeLine("hello world!!!");
        }*/
    }

}
