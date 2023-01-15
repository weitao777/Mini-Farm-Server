package com.cqut.atao.user.application.service;

import com.cqut.atao.farm.user.domain.model.res.LoginRes;

import java.util.Map;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName IUserService.java
 * @Description 用户服务接口
 * @createTime 2023年01月12日 21:06:00
 */
public interface UserLogin {

    LoginRes login(Map<String,String> data);


}