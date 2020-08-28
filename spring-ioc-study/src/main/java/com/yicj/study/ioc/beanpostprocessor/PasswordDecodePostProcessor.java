package com.yicj.study.ioc.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName: PasswordDecodePostProcessor
 * Description: TODO(描述)
 * Date: 2020/7/25 15:51
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class PasswordDecodePostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof PasswordDecodable){
            PasswordDecodable passwordDecodable = (PasswordDecodable) bean ;
            String encodedPassword = passwordDecodable.getEncodedPassword();
            String decodedPassword = decodePassword(encodedPassword) ;
            passwordDecodable.setDecodedPassword(decodedPassword);
        }
        return bean;
    }


    private String decodePassword(String encodedPassword){
        // 实现解码逻辑
        return encodedPassword +"_456";
    }
}