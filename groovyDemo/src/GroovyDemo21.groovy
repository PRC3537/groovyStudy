/**
 *  Created by  gonghuihui55 on 2018/5/10
 *  xml 构建与解析
 */
import groovy.xml.MarkupBuilder
import groovy.util.*
class GroovyDemo21 {
    static void main(String[] args){
        def mp = [1 : ['Enemy Behind', 'War, Thriller','DVD','2003',
                       'PG', '10','Talk about a US-Japan war'],
                  2 : ['Transformers','Anime, Science Fiction','DVD','1989',
                       'R', '8','A scientific fiction'],
                  3 : ['Trigun','Anime, Action','DVD','1986',
                       'PG', '10','Vash the Stam pede'],
                  4 : ['Ishtar','Comedy','VHS','1987', 'PG',
                       '2','Viewable boredom ']];

        def mB = new MarkupBuilder();

        def MOVIEDB = mB.collection(shelf : 'New Arrivals'){
            mp.each {
                sd ->
                    mB.movie('title':sd.value[0]) {
                        type(sd.value[1])
                        format(sd.value[2])
                        year(sd.value[3])
                        rating(sd.value[4])
                        stars(sd.value[5])
                        description(sd.value[6])
                    }
            }


        }

        // xml解析
        def parase = new XmlParser();
        def doc = parase.parse("src/Directory/movies.xml");

        doc.each {
            bk ->
//                println("\n ***************************************")
//                println(bk)   怎么取值的？？？
                println("\n ***************************************")
                println("Movie Name : ${bk['@title']}")
                println("Movie Type : ${bk.type[0].text()}")
                println("Movie format : ${bk.format[0].text()}")
                println("Movie year : ${bk.year[0].text()}")
                println("Movie rating : ${bk.rating[0].text()}")
                println("Movie stars : ${bk.stars[0].text()}")
                println("Movie description : ${bk.description[0].text()}")
        }
    }

}
