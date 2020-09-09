package cn.wind.boot.db.mapper.qinghai;

import cn.wind.boot.db.domain.qinghai.response.IptvDailyDataResponse;

import java.util.List;

/**
 * @author liuw
 * @date 2020/09/09
 */
public interface IptvDailyDataMapper {

    /**
     * 统计iptv数据日报
     *
     * @param date 日期
     * @return
     */
    List<IptvDailyDataResponse> countIptvDailyData(String date);

}
