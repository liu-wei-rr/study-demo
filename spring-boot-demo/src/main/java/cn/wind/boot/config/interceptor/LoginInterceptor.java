package cn.wind.boot.config.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 *
 * @author liuw
 * @date 2020-08-26
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        log.info("RequestURI:{}", request.getRequestURI());

        // 如果是 swagger 请求通过
        if (request.getRequestURI().startsWith("/swagger-resources") ||
                request.getRequestURI().startsWith("/swagger-ui.html")) {
            return true;
        }

        // 如果是登录放过
        if (request.getRequestURI().startsWith("/login")) {
            return true;
        }

        // 获取header串号
        String token = request.getHeader("Authorization");
        log.info("获取token值:" + token);
        log.info("获取请求方式:" + request.getMethod());

        // 验证redis串号
        if (token == null || "".equals(token)) {
            log.info("------非法登入(token为空)-----");
            return false;
        } else {
//            // TODO 从redis获取用户信息
//            String tokenKey = CacheConstants.WX_USER_TOKEN + token;
//            boolean exists = redisTemplate.hasKey(tokenKey);
//            if (exists) {
//	            LoginUser usersResp = (LoginUser)redisTemplate.opsForValue().get(tokenKey);
//	            request.setAttribute(Const.LOGIN_USER, usersResp);
//                return true;
//            } else {
//                ResponseData rd = new ResponseData.Builder().error("登录失效，请重新登录!").build();
//                response.addHeader("Access-Control-Allow-Origin", "*");
//                response.addHeader("Content-Type", "application/json;charset=UTF-8");
//                response.getWriter().print(JSONUtil.toJson(rd));
//                log.info("------非法登入(redis验证token不存在)-----");
//                return false;
//            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {


    }

}
