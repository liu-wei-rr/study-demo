package cn.wind.boot.service.qinghai.impl;

import cn.wind.boot.db.domain.qinghai.TemplatePackageHistoryDownload;
import cn.wind.boot.db.mapper.qinghai.TemplatePackageHistoryDownloadMapper;
import cn.wind.boot.service.qinghai.TemplatePackageHistoryDownloadService;
import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liuw
 * @date 2020/9/4
 */
@Slf4j
@Service
public class TemplatePackageHistoryDownloadServiceImpl implements TemplatePackageHistoryDownloadService {

    @Resource
    private TemplatePackageHistoryDownloadMapper tempMapper;
    
    @DS("slave")
    @Override
    public TemplatePackageHistoryDownload getById(Long id) {
        return tempMapper.selectById(id);
    }
}
