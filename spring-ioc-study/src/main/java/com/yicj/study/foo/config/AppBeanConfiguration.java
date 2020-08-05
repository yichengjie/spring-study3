package com.yicj.study.foo.config;

import com.yicj.study.foo.service.FXNewsProvider;
import com.yicj.study.foo.service.IFXNewsListener;
import com.yicj.study.foo.service.IFXNewsPersistent;
import com.yicj.study.foo.service.impl.DowJonesNewListener;
import com.yicj.study.foo.service.impl.DowJonesNewsPersistent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: AppBeanConfiguration
 * Description: TODO(描述)
 * Date: 2020/8/1 21:39
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Configuration
public class AppBeanConfiguration {

    @Bean
    public IFXNewsListener newsListener(){
        System.out.println("-------newsListener()---------");
        return new DowJonesNewListener() ;
    }

    @Bean
    public IFXNewsPersistent newsPersistent(){
        System.out.println("-------newsPersistent()---------");
        return new DowJonesNewsPersistent() ;
    }

    @Bean
    public FXNewsProvider newsProvider(IFXNewsListener newsListener, IFXNewsPersistent newsPersistent){
        FXNewsProvider newsProvider = new FXNewsProvider();
        newsProvider.setNewsListener(newsListener);
        newsProvider.setNewsPersistent(newsPersistent);
        return newsProvider ;
    }

    @Bean
    public FXNewsProvider newsProvider2(){
        FXNewsProvider newsProvider = new FXNewsProvider();
        newsProvider.setNewsListener(newsListener());
        newsProvider.setNewsPersistent(newsPersistent());
        return newsProvider ;
    }

}