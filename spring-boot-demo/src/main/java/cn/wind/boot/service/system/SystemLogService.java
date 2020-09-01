package cn.wind.boot.service.system;

import cn.wind.boot.db.domain.system.SystemLog;
import cn.wind.boot.db.domain.system.request.SystemLogRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author liuw
 * @date 2020/8/20
 */
public interface SystemLogService {

    /**
     * 根据 id 查询
     *
     * @param id
     * @return
     */
    SystemLog getById(Long id);

    /**
     * 新增
     */
    int insert(SystemLog systemLog);

    /**
     * 分页查询
     * 
     * @return
     */
    IPage<SystemLog> getByPage(SystemLogRequest systemLogRequest);
}
