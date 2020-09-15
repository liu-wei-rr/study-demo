package cn.wind.boot.controller.test;

import cn.wind.boot.common.base.controller.BaseController;
import cn.wind.boot.common.base.response.ResponseData;
import cn.wind.boot.service.test.TestSortService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuw
 * @date 2020/8/20
 */
@Api(value = "TestController", tags = "测试")
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private TestSortService testSortService;

    @ApiOperation(value = "排序")
    @GetMapping("/sort}")
    public ResponseData sort() {
        testSortService.testSort();
        return success();
    }
    
}
