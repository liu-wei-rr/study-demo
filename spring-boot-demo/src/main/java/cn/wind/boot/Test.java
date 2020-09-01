package cn.wind.boot;

import cn.wind.boot.common.enums.BusinessType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liuw
 * @date 2020/8/24
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        
        String ids = "1,2,3,4,5,";
        System.out.println(ids.length()); //10
        System.out.println(ids.substring(0,ids.length()-1)); // 截取从0开始，到9结束
        
        log.info("{}",BusinessType.OTHER);
        
    }
    
}
