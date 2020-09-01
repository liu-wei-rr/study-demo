package cn.wind.boot.common.util;

import cn.wind.boot.common.constant.CacheConstants;

import java.util.UUID;

/**
 * @author liuw
 * @date 2020-09-01
 * 日期工具类
 */
public class CodeUtil {

    /**
     * 生成用户redis缓存token
     *
     * @return
     */
    public static String getUserToken() {
        return CacheConstants.USER_TOKEN + UUID.randomUUID().toString().replaceAll("-", "");
    }
}
