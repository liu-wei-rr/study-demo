package cn.wind.boot.db.domain.system;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author liuw 
 * @date 2020-08-20
 */
@TableName("system_user")
@Data
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 2596059579817014810L;
    
    private Long id;

    private String username;

    private String password;

    private String idCard;

    private String sex;

    private String status;

    private String orgCode;

    private String phone;

    private String remark;

    private String createName;

    private Date createTime;

    private String updateName;

    private Date updateTime;
}
