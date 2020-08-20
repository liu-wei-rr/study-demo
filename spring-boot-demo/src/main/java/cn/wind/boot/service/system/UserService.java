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
     * 根据id查询
     *
     * @param id
     * @return
     */
    User getById(Long id);

    /**
     * 获取有效状态的用户基本信息
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
