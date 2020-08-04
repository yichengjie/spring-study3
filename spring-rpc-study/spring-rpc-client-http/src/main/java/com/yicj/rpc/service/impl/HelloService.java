package com.yicj.rpc.service.impl;


import com.yicj.rpc.model.User;
import com.yicj.rpc.service.IHello;
import com.yicj.rpc.remote.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: HelloService
 * Description: TODO(描述)
 * Date: 2020/8/4 20:38
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
@Service
public class HelloService implements IHello {

    @Autowired
    private IUserService userService ;

    @Override
    public void hello(String username, String addr) {
        User user = new User() ;
        user.setUsername(username);
        user.setAddr(addr);
        User retUser = userService.saveUser(user);
        log.info("ret user : {}", retUser);
    }
}