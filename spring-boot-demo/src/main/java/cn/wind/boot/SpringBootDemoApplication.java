package cn.wind.boot;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author liuw
 * @date 2020-08-20
 */
@Slf4j
@EnableCaching // 开启缓存
@SpringBootApplication
@MapperScan("cn.wind.boot.db.mapper.*")
public class SpringBootDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
        log.info("欢迎进入 SpringBootDemo ~~~");
    }
    
}
