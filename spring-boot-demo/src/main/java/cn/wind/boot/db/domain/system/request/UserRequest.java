package cn.wind.boot.db.domain.system.request;

import cn.wind.boot.common.base.request.BaseRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuw
 * @date 2020/8/20
 */
@Data
@NoArgsConstructor
public class UserRequest extends BaseRequest {
    
    private String username;
    
    private String status;
}
