package cn.wind.boot.controller.qinghai;

import cn.wind.boot.common.base.controller.BaseController;
import cn.wind.boot.common.base.response.ResponseData;
import cn.wind.boot.db.domain.qinghai.request.IptvDailyDataRequest;
import cn.wind.boot.service.qinghai.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务Controller
 *
 * @author liuw
 * @date 2020/09/09
 */
@Api(value = "TaskController", tags = "任务Controller")
@Slf4j
@RestController
@RequestMapping("/qinghai/task")
public class TaskController extends BaseController {

    @Autowired
    private TaskService taskService;

    @ApiOperation(value = "青海IPTV数据日报")
    @PostMapping("/dailyData")
    public ResponseData getIptvDailyData(IptvDailyDataRequest request) {
        return success(taskService.getIptvDailyData(request));
    }

}
