package com.yicj.study.jdbc.mutidatasource.client2;

import com.yicj.study.jdbc.mutidatasource.client1.Main;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * ClassName: Main2
 * Description: TODO(描述)
 * Date: 2020/7/25 22:24
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class Main2 {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = Main.execute("beans2.xml", Main2.class);
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
        for (Map<String,Object> map: list){
            log.info("info: {}", map);
        }
    }
}