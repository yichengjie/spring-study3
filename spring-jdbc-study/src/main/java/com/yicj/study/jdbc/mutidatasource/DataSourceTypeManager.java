package com.yicj.study.jdbc.mutidatasource;


/**
 * ClassName: DataSourceTypeManager
 * Description: TODO(描述)
 * Date: 2020/7/25 20:41
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class DataSourceTypeManager {

    private static ThreadLocal<DataSourceType> threadLocal =
            ThreadLocal.withInitial(() -> DataSourceType.MAIN) ;

    public static DataSourceType get(){
        return threadLocal.get() ;
    }

    public static void set(DataSourceType type){
        threadLocal.set(type);
    }
}