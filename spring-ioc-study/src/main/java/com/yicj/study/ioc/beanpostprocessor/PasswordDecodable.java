package com.yicj.study.ioc.beanpostprocessor;

/**
 * ClassName: PasswordDecodable
 * Description: TODO(描述)
 * Date: 2020/7/25 15:42
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public interface PasswordDecodable {
    String getEncodedPassword() ;
    void setDecodedPassword(String password) ;
}