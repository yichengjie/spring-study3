package com.yicj.study.jdbc.mutidatasource.client2;

import com.yicj.study.jdbc.mutidatasource.client1.Main;
import java.sql.SQLException;

/**
 * ClassName: Main2
 * Description: TODO(描述)
 * Date: 2020/7/25 22:24
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main2 {

    public static void main(String[] args) throws SQLException {
        Main.execute("beans2.xml", Main2.class);
    }
}