package com.yicj.study.ioc.factorymethod.instancemethod;

import com.yicj.study.ioc.factorymethod.BarInterface;
import com.yicj.study.ioc.factorymethod.BarInterfaceImpl;

/**
 * ClassName: NonStaticBarInterfaceFactory
 * Description: TODO(描述)
 * Date: 2020/7/24 10:15
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class NonStaticBarInterfaceFactory {

    public BarInterface getInstance(){

        return new BarInterfaceImpl() ;
    }
}