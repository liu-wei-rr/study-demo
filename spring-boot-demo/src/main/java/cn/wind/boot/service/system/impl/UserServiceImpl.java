package cn.wind.boot.service.system.impl;

import cn.wind.boot.db.domain.system.User;
import cn.wind.boot.db.domain.system.request.UserRequest;
import cn.wind.boot.db.domain.system.response.UserResponse;
import cn.wind.boot.db.mapper.system.UserMapper;
import cn.wind.boot.service.system.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuw
 * @date 2020/8/20
 */
@Slf4j
@Service
@CacheConfig(cacheNames = "USER")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Cacheable(key = "#id")
    public User getById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public List<UserResponse> getEffectiveUserList() {
        // 设置用户启用状态
        String status = "1";

        /**
         * 拼接条件查询
         */
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("username", "admin");
        wrapper.eq("password", "1");
        wrapper.or(i -> i.eq("username", "Rose").eq("org_code","ORG1-2"));
        List<User> userList = userMapper.selectList(wrapper);
        
        userList.stream().forEach(e -> {
            e.getUsername();
        });

        return userMapper.selectByStatus(status);
    }

    @Override
    public IPage<UserResponse> getByPage(UserRequest userRequest) {
        // 设置分页
        Page<UserResponse> page = new Page<>(userRequest.getPage(), userRequest.getPageSize());
        
        // userMapper.selectByStatus(page, userRequest.getStatus())
        
        return userMapper.selectByStatus(page, userRequest.getStatus());
    }
}
