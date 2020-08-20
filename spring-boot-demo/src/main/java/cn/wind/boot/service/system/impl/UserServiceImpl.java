package cn.wind.boot.service.system.impl;

import cn.wind.boot.db.domain.system.User;
import cn.wind.boot.db.domain.system.request.UserRequest;
import cn.wind.boot.db.domain.system.response.UserResponse;
import cn.wind.boot.db.mapper.system.UserMapper;
import cn.wind.boot.service.system.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuw
 * @date 2020/8/20
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<UserResponse> getEffectiveUserList() {
        // 1-用户启用状态
        String status = "1";
        return userMapper.selectByStatus(status);
    }

    @Override
    public IPage<UserResponse> getByPage(UserRequest userRequest) {
        // 设置分页
        Page<UserResponse> page = new Page<>(userRequest.getPage(), userRequest.getPageSize());
        return userMapper.selectByStatus(page, userRequest.getStatus());
    }
}
