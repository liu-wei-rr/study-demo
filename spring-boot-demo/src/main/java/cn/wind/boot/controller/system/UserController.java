package cn.wind.boot.controller.system;

import cn.wind.boot.common.base.controller.BaseController;
import cn.wind.boot.common.base.response.ResponseData;
import cn.wind.boot.db.domain.system.request.UserRequest;
import cn.wind.boot.db.domain.system.response.UserResponse;
import cn.wind.boot.service.system.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuw
 * @date 2020/8/20
 */
@Api(value = "UserController", tags = "用户管理")
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据id查询用户信息")
    @GetMapping("/id/{id}")
    public ResponseData getById(@PathVariable("id") Long id) {
        return success(userService.getById(id));
    }

    @ApiOperation(value = "获取有效用户信息列表")
    @GetMapping("/effective")
    public ResponseData getEffectiveUserList() {
        return success(userService.getEffectiveUserList());
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/page")
    public ResponseData getByPage(@RequestBody UserRequest userRequest) {
        IPage<UserResponse> page = userService.getByPage(userRequest);
        return success(page.getRecords(), page.getTotal());
    }
}
