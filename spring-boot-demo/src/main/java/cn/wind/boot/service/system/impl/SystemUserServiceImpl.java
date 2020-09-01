package cn.wind.boot.service.system.impl;

import cn.wind.boot.db.domain.system.SystemUser;
import cn.wind.boot.db.domain.system.request.SystemUserRequest;
import cn.wind.boot.db.domain.system.response.SystemUserResponse;
import cn.wind.boot.db.mapper.system.SystemUserMapper;
import cn.wind.boot.service.system.SystemUserService;
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
public class SystemUserServiceImpl implements SystemUserService {

    @Resource
    private SystemUserMapper systemUserMapper;

    @Override
    @Cacheable(key = "#id")
    public SystemUser getById(Long id) {
        return systemUserMapper.selectById(id);
    }

    @Override
    public int insert(SystemUser systemUser) {
        return systemUserMapper.insert(systemUser);
    }

    @Override
    public int update(SystemUser systemUser) {
        return systemUserMapper.updateById(systemUser);
    }

    @Override
    public int delete(Long id) {
        return systemUserMapper.deleteById(id);
    }

    @Override
    public List<SystemUserResponse> getEffectiveUserList() {
        // 设置用户启用状态
        String status = "1";

        /**
         * 拼接条件查询
         */
        QueryWrapper<SystemUser> wrapper = new QueryWrapper<SystemUser>();
        wrapper.eq("username", "admin");
        wrapper.eq("password", "1");
        wrapper.or(i -> i.eq("username", "Rose").eq("org_code","ORG1-2"));
        List<SystemUser> systemUserList = systemUserMapper.selectList(wrapper);
        
        systemUserList.stream().forEach(e -> {
            e.getUsername();
        });

        return systemUserMapper.selectByStatus(status);
    }

    @Override
    public IPage<SystemUserResponse> getByPage(SystemUserRequest systemUserRequest) {
        // 设置分页
        Page<SystemUserResponse> page = new Page<>(systemUserRequest.getPage(), systemUserRequest.getPageSize());
        
        // userMapper.selectByStatus(page, userRequest.getStatus())
        
        return systemUserMapper.selectByStatus(page, systemUserRequest.getStatus());
    }
}
