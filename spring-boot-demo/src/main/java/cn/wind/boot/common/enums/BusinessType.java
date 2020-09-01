package cn.wind.boot.common.enums;

/**
 * 业务操作类型
 * 
 * @author liuw
 * @date 2020-08-25
 */
public enum BusinessType {
    
    /**
     * 其它
     */
    OTHER,

    /**
     * 新增
     */
    INSERT,

    /**
     * 修改
     */
    UPDATE,

    /**
     * 删除
     */
    DELETE,

    /**
     * 授权
     */
    GRANT,

    /**
     * 导出
     */
    EXPORT,

    /**
     * 导入
     */
    IMPORT,

    /**
     * 强退
     */
    FORCE,
    
    /**
     * 清空
     */
    CLEAN,
}
