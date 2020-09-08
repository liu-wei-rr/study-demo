package csv;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuw
 * @date 2020/9/8
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        CsvUtil csvUtil = new CsvUtil();
        String path = "D:\\Documents\\test.csv";
        try {
            InputStreamReader in = new InputStreamReader(new FileInputStream(path), "utf-8");
            if (null != in) {
                List<SxltIptvData> sxltIptvDataList = csvUtil.toBeanByPosition(in, SxltIptvData.class);
                sxltIptvDataList.stream().forEach(e -> {
                    System.out.println(e.toString());
                }); 
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读 csv 文件
     */
    private void readCsv() {
        CSVReader csvReader = null;
        try {
            String path = "D:\\Documents\\test.csv";
            csvReader = new CSVReader(new InputStreamReader(new FileInputStream(path), "utf-8"));
            String[] strs;
            while ((strs = csvReader.readNext()) != null) {
                System.out.println(Arrays.deepToString(strs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvReader != null) {
                    csvReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
