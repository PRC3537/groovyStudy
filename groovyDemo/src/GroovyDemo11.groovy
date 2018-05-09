/**
 *  Created by  gonghuihui55 on 2018/5/9
 */

class GroovyDemo11 {
    static void main(String[] args){
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods on Maps"];

        // containsKey()
        println(mp.containsKey("Topic"));
        println(mp.containsKey("TopicName"));

        // get()
        println(mp.get("TopicName"));

        // keySet()  获取键
        println(mp.keySet());

        // put()
        mp.put("TopicID","1");
        println(mp);

        // size()
        println(mp.size());

        // values()
        println(mp.values());
    }
}
