package com.yicj.rpc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: User
 * Description: TODO(描述)
 * Date: 2020/8/4 20:34
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Data
public class User implements Serializable {
    private Integer id ;
    private String username ;
    private String addr ;
}