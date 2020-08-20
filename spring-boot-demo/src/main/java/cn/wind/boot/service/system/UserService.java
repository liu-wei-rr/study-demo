package cn.wind.boot.service.system;

import cn.wind.boot.db.domain.system.User;

/**
 * @author liuw
 * @date 2020/8/20
 */
public interface UserService {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    User getById(Long id);
}
