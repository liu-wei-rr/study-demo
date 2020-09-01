package cn.wind.boot.controller.system;

import cn.wind.boot.common.base.controller.BaseController;
import cn.wind.boot.common.base.response.ResponseData;
import cn.wind.boot.db.domain.system.request.LoginRequest;
import cn.wind.boot.service.system.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author liuw
 * @date 2020/09/01
 */
@Api(value = "LoginController", tags = "登录管理")
@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "用户登录")
    @PostMapping("/in")
    public ResponseData loginIn(@RequestBody @Valid LoginRequest loginRequest) {
        String token = loginService.loginIn(loginRequest);
        return response("200","用户登录成功！", token);
    }
}
