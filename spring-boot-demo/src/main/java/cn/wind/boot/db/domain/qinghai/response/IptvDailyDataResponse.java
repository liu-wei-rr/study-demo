package cn.wind.boot.db.domain.qinghai.response;

import lombok.Data;

import java.io.Serializable;

/**
 * iptv数据日报 返回
 *
 * @author liuw
 * @date 2020/8/20
 */
@Data
public class IptvDailyDataResponse implements Serializable {

    private static final long serialVersionUID = -8698355307728577602L;
    
    // 类别
    private String type;

    // 总数
    private Integer amount;
}
