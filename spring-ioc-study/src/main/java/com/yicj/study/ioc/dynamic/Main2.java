package com.yicj.study.ioc.dynamic;

import com.yicj.study.ioc.earlysingletonexposure.AAA;
import com.yicj.study.ioc.earlysingletonexposure.CCC;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * ClassName: Main2
 * Description: TODO(描述)
 * Date: 2020/8/4 23:18
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main2 {

    public static void main(String[] args) {
        //System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true") ;
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code\\idea\\spring-study3\\spring-ioc-study\\");
        AAA aaa = new AAA() ;
        Object proxy = new CCC.CGLIBProxy(aaa).createProxy();
        ((AAA)proxy).hello("张三", 22);
       /* String namesAndDescriptors [] = new String[]{"hello",
                "(Ljava/lang/String;Ljava/lang/Integer;)V",
                "setBbb",
                "(Lcom/yicj/study/ioc/earlysingletonexposure/BBB;)V",
                "getBbb",
                "()Lcom/yicj/study/ioc/earlysingletonexposure/BBB;"} ;

        Method[] declaredMethods = (Class.forName("com.yicj.study.ioc.earlysingletonexposure.AAA")).getDeclaredMethods();
        Method[] var10000 = ReflectUtils.findMethods(namesAndDescriptors, declaredMethods);
        Method CGLIB$hello$0$Method = var10000[0];
        System.out.println(CGLIB$hello$0$Method.getName());*/


        //String methodDescriptor = Type.getMethodDescriptor(CGLIB$hello$0$Method);
        //System.out.println(methodDescriptor);
    }
}