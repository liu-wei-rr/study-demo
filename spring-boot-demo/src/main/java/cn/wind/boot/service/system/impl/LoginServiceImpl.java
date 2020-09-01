package cn.wind.boot.service.system.impl;

import cn.wind.boot.common.base.exception.LoginException;
import cn.wind.boot.common.util.CodeUtil;
import cn.wind.boot.common.util.RedisUtil;
import cn.wind.boot.db.domain.system.SystemUser;
import cn.wind.boot.db.domain.system.request.LoginRequest;
import cn.wind.boot.db.domain.system.response.LoginUser;
import cn.wind.boot.service.system.LoginService;
import cn.wind.boot.service.system.SystemUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuw
 * @date 2020/9/1
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SystemUserService systemUserService;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public String loginIn(LoginRequest loginRequest) {
        // 根据用户名查询用户信息
        SystemUser systemUser = systemUserService.getByUsername(loginRequest.getUsername());
        if (null != systemUser && loginRequest.getPassword().equals(systemUser.getPassword())) {
            // 存用户信息至redis
            LoginUser loginUser = new LoginUser();
            loginUser.setUsername(systemUser.getUsername());
            loginUser.setIdCard(systemUser.getIdCard());
            loginUser.setSex(systemUser.getSex());
            loginUser.setOrgCode(systemUser.getOrgCode());
            loginUser.setPhone(systemUser.getPhone());
            
            String token = CodeUtil.getUserToken();
            redisUtil.set(token, new Gson().toJson(loginUser));
            return token;
        }
        throw new LoginException("用户名或密码错误！");
    }
}
