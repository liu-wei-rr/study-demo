package cn.wind.boot.service.qinghai.impl;

import cn.wind.boot.db.domain.qinghai.TemplatePackageHistoryDownload;
import cn.wind.boot.db.mapper.qinghai.TemplatePackageHistoryDownloadMapper;
import cn.wind.boot.service.qinghai.TemplatePackageHistoryDownloadService;
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
    
    @Override
    public TemplatePackageHistoryDownload getById(Long id) {
        TemplatePackageHistoryDownload t = new TemplatePackageHistoryDownload();
        t.setID(1L);
        return t;
    }
}
