package com.yicj.study.tx.hello.service.impl;

import com.yicj.study.tx.hello.model.User;
import com.yicj.study.tx.hello.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Description: TODO(描述)
 * Date: 2020/8/4 12:47
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class UserServiceImpl implements UserService {

    @Override
    public void insertUser(User user) {

        System.out.println("insert user ....");
    }

    @Override
    public List<User> queryAllUser() {

        System.out.println("query all user ....");
        return null;
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user ....");
    }
}