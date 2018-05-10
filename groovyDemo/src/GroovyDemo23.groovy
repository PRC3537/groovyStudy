import groovy.sql.Sql

/**
 *  Created by  gonghuihui55 on 2018/5/10
 *  数据库操作
 */

class GroovyDemo23 {
    static void main(String[] args){
        def sql = Sql.newInstance('jdbc:mysql://121.43.177.8:3344/loandb',
        'gonghuihui','xeSOZ6yLUrf2c6Ev','com.mysql.jdbc.Driver');
        sql.eachRow('SELECT VERSION()'){
            row ->
                println row[0]
        }
        // 查询
        sql.eachRow('select * from `t_website_login_config` limit 1'){
            row ->
                println ([row.WebName, row.Website, row.DataType]);
        }

        sql.close()
    }
}
