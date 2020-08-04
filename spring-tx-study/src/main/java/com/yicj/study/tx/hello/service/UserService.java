package com.yicj.study.tx.hello.service;

import com.yicj.study.tx.hello.model.User;

import java.util.List;

/**
 * ClassName: UserService
 * Description: TODO(描述)
 * Date: 2020/8/4 12:44
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public interface UserService {

    void insertUser(User user) ;

    List<User> queryAllUser() ;

    void updateUser(User user) ;
}