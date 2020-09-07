package cn.wind.boot.controller.qinghai;

import cn.wind.boot.common.base.controller.BaseController;
import cn.wind.boot.common.base.response.ResponseData;
import cn.wind.boot.service.qinghai.TemplatePackageHistoryDownloadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuw
 * @date 2020/09/04
 */
@Api(value = "TemplatePackageHistoryDownloadController", tags = "TemplatePackageHistoryDownload")
@Slf4j
@RestController
@RequestMapping("/qinghai/temp")
public class TemplatePackageHistoryDownloadController extends BaseController {

    @Autowired
    private TemplatePackageHistoryDownloadService tempService;

    @ApiOperation(value = "根据id查询信息")
    @GetMapping("/id/{id}")
    public ResponseData getById(@PathVariable("id") Long id) {
        return success(tempService.getById(id));
    }
    
}
