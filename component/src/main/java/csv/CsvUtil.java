package csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import java.io.InputStreamReader;
import java.util.List;

/**
 * @author liuw
 * @date 2020/9/8
 */
public class CsvUtil {

    /**
     * @param in    csv文件输入流
     * @param clazz 类
     * @param <T>   泛型
     * @return 泛型bean集合
     */
    public <T> List<T> getCsvData(InputStreamReader in, Class<T> clazz) {

        HeaderColumnNameMappingStrategy<T> strategy = new HeaderColumnNameMappingStrategy<>();

        strategy.setType(clazz);

        CsvToBean<T> csvToBean = new CsvToBeanBuilder<T>(in)
                .withSeparator(',')
                .withQuoteChar('\'')
                .withMappingStrategy(strategy)
                .build();
        return csvToBean.parse();
    }
}
