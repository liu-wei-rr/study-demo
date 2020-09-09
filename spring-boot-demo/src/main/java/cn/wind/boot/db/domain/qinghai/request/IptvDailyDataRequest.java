package cn.wind.boot.db.domain.qinghai.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

/**
 * iptv数据日报 请求
 *
 * @author liuw
 * @date 2020/09/09
 */
@Data
@NoArgsConstructor
public class IptvDailyDataRequest {

    /**
     * 统计日期
     */
    @ApiModelProperty(value = "2020-", example = "2020-09-09")
    @NotBlank(message = "统计日期不能为空！")
    private String date;

}
