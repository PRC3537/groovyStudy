/**
 *  Created by  gonghuihui55 on 2018/5/9
 *  Groovy 错误处理
 */

class GroovyDemo13 {
    static void main(String[] args){
        try{
            def arr = new int[3];
            arr[5] = 3;

        }catch (ArrayIndexOutOfBoundsException ex){
            println(ex.toString());
            println(ex.getMessage());
            println(ex.getStackTrace());
            println("Catching the Array out of Bounds exception");
        }
        catch (Exception ex){
            println("Catching the exception");

        } finally{
            println("The final block.")
        }
        println("Let's move on after the exception");
    }
}
