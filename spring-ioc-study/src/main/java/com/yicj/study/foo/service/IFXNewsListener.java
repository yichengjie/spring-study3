package com.yicj.study.foo.service;

import com.yicj.study.foo.model.FxNewsBean;

/**
 * 设计IFXNewsListener接口抽象各个新闻社不同的新闻获取方式，并给出相应的实现类
 */
public interface IFXNewsListener {

    String [] getAvailableNewsIds() ;

    FxNewsBean getNewsByPK(String newId) ;

    void postProcessIfNecessary(String newsId) ;

}
