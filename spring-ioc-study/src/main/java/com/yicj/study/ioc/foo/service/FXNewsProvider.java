package com.yicj.study.ioc.foo.service;

/**
 * 设计FXNewsProvider类用于普遍的新闻阅读处理
 * ClassName: FXNewsProvider
 * Description: TODO(描述)
 * Date: 2020/7/23 20:57
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class FXNewsProvider {

    private IFXNewsListener newsListener ;
    private IFXNewsPersistent newsPersistent ;

    public FXNewsProvider(){

    }

    public FXNewsProvider(IFXNewsListener newsListener,
                          IFXNewsPersistent newsPersistent){
        this.newsListener = newsListener ;
        this.newsPersistent = newsPersistent ;
    }


    public void getAndPersistNews() {
        System.out.println(newsListener.getClass().getName());
        System.out.println(newsPersistent.getClass().getName());
        System.out.println("hello world");
    }

    public IFXNewsListener getNewsListener() {
        return newsListener;
    }

    public void setNewsListener(IFXNewsListener newsListener) {
        this.newsListener = newsListener;
    }

    public IFXNewsPersistent getNewsPersistent() {
        return newsPersistent;
    }

    public void setNewsPersistent(IFXNewsPersistent newsPersistent) {
        this.newsPersistent = newsPersistent;
    }
}