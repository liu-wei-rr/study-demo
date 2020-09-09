package cn.wind.boot.service.qinghai;

import cn.wind.boot.db.domain.qinghai.request.IptvDailyDataRequest;

import java.util.Map;

/**
 * 任务Controller
 *
 * @author liuw
 * @date 2020/09/09
 */
public interface TaskService {

    /**
     * 青海IPTV数据日报
     *
     * @param request
     */
    public Map<String, Object> getIptvDailyData(IptvDailyDataRequest request);

}
