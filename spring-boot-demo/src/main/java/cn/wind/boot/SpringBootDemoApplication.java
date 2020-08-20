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
        log.info("================== SpringBootDemo ==================");
        log.info("===============  （0田0）※=o大威天龙 =================");
        log.info("=============== （⊙口⊙卍 }}}˜”世尊地藏 ===============");
        log.info("=============== ｛（>A<）｝〃≈≈大罗法咒  ===============");
        log.info("=============== ヽ(ˋДˊ)ノ卍卍卍般若诸佛 ===============");
    }
    
}
