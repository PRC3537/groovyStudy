/**
 *  Created by  gonghuihui55 on 2018/5/8
 */

class GroovyDemo4 {
    int x;

    public int getX(){
        return x;
    }

    public void setX(int pX){
        x = pX;
    }

    static void main(String[] args){
        GroovyDemo4 gr = new GroovyDemo4();
        gr.setX(100);
        println(gr.getX());
    }
}
