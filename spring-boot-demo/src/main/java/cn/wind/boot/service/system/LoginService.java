package cn.wind.boot.service.system;

import cn.wind.boot.db.domain.system.request.LoginRequest;

/**
 * @author liuw
 * @date 2020/09/01
 */
public interface LoginService {

    /**
     * 用户登录
     *
     * @param loginRequest
     * @return
     */
    String loginIn(LoginRequest loginRequest);

    /**
     * 用户登出
     * 
     */
    void loginOut(String token);

}
