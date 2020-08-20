package cn.wind.boot.service.system.impl;

import cn.wind.boot.db.domain.system.User;
import cn.wind.boot.db.domain.system.response.UserResponse;
import cn.wind.boot.db.mapper.system.UserMapper;
import cn.wind.boot.service.system.UserService;
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
        return userMapper.selectByStatus();
    }
}
