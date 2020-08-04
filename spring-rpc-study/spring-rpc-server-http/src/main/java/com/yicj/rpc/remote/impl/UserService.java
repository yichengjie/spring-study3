package com.yicj.rpc.remote.impl;

import com.yicj.rpc.model.User;
import com.yicj.rpc.remote.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserService
 * Description: TODO(描述)
 * Date: 2020/8/4 20:59
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
@Service
public class UserService implements IUserService {
    @Override
    public User saveUser(User user) {
        log.info("server save user : {}", user);
        user.setId(100);
        return user;
    }
}