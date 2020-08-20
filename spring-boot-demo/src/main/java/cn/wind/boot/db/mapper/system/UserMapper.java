package cn.wind.boot.db.mapper.system;

import cn.wind.boot.db.domain.system.User;
import cn.wind.boot.db.domain.system.response.UserResponse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author liuw
 * @date 2020/8/20
 */
public interface UserMapper extends BaseMapper<User> {

    List<UserResponse> selectByStatus();

}
