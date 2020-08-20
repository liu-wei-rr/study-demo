package cn.wind.boot.service.system;

import cn.wind.boot.db.domain.system.User;
import cn.wind.boot.db.domain.system.request.UserRequest;
import cn.wind.boot.db.domain.system.response.UserResponse;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @author liuw
 * @date 2020/8/20
 */
public interface UserService {

    /**
     * 根据 id 查询
     *
     * @param id
     * @return
     */
    User getById(Long id);

    /**
     * 新增
     */
    int insert(User user);

    /**
     * 根据 id 修改
     */
    int update(User user);

    /**
     * 根据 id 删除
     */
    int delete(Long id);

    /**
     * 获取全量用户信息列表
     * 
     * @return
     */
    List<UserResponse> getEffectiveUserList();

    /**
     * 分页查询
     * 
     * @return
     */
    IPage<UserResponse> getByPage(UserRequest userRequest);
}
