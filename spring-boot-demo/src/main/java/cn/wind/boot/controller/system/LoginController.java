package cn.wind.boot.controller.system;

import cn.wind.boot.common.base.controller.BaseController;
import cn.wind.boot.common.base.response.ResponseData;
import cn.wind.boot.db.domain.system.request.LoginRequest;
import cn.wind.boot.service.system.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;

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
        HashMap<String, String> map = new HashMap<>(2);
        map.put("token", token);
        return response("200","用户登录成功！", map);
    }

    @ApiOperation(value = "用户登出")
    @GetMapping("/out/{token}")
    public ResponseData loginOut(@PathVariable("token") @NotBlank String token) {
        loginService.loginOut(token);
        return success("用户登出成功！");
    }
}
