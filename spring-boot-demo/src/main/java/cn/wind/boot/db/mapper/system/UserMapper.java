package cn.wind.boot.db.mapper.system;

import cn.wind.boot.db.domain.system.User;
import cn.wind.boot.db.domain.system.response.UserResponse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liuw
 * @date 2020/8/20
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据状态查询
     * @param status
     * @return
     */
    List<UserResponse> selectByStatus(@Param("status") String status);

    /**
     * 根据状态分页查询
     * @param page
     * @param status
     * @return
     */
    IPage<UserResponse> selectByStatus(Page<UserResponse> page, @Param("status") String status);
}
