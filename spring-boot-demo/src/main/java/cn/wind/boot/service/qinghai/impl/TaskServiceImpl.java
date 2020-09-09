package cn.wind.boot.service.qinghai.impl;

import cn.wind.boot.db.domain.qinghai.request.IptvDailyDataRequest;
import cn.wind.boot.db.domain.qinghai.response.IptvDailyDataResponse;
import cn.wind.boot.db.mapper.qinghai.IptvDailyDataMapper;
import cn.wind.boot.service.qinghai.TaskService;
import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author liuw
 * @date 2020/9/9
 */
@Slf4j
@Service
public class TaskServiceImpl implements TaskService {
    
    @Resource 
    private IptvDailyDataMapper iptvDailyDataMapper;
    
    @DS("slave")
    @Override
    public HashMap<String, Object> getIptvDailyData(IptvDailyDataRequest request) {
        String date = request.getDate() + " 23:59:59";
        List<IptvDailyDataResponse> iptvDailyDataList = iptvDailyDataMapper.countIptvDailyData(date);
        
        // 优品会员到达
        int yp = 0;
        // 教育优品会员到达
        int jy = 0;
        // 爱优腾到达
        int ay = 0;
        
        // 处理结果集
        for (IptvDailyDataResponse iptv : iptvDailyDataList) {
            // 优品会员到达：全部类别之和
            yp += iptv.getAmount();
            
            // 教育优品会员到达：类别为教育
            if("教育".equals(iptv.getType())) {
                jy += iptv.getAmount();
            }
            
            // 优品会员到达："影视-优酷-介质" 和 "影视-爱奇艺-介质" 之和
            if("影视-优酷-介质".equals(iptv.getType()) || "影视-爱奇艺-介质".equals(iptv.getType())) {
                ay += iptv.getAmount();
            }
        }
        
        // 封装结果
        HashMap<String, Object> result = new HashMap<>();
        result.put("日期", request.getDate());
        result.put("优品会员到达", yp);
        result.put("教育优品会员到达", jy);
        result.put("爱优腾到达", ay);
        
        return result;
    }
    
}
