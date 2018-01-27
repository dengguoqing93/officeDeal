package excel.excelImpl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author guoqing
 * @createDate： 2018/1/28 2:32
 * @Description: $Descriptions
 */
public class ReadCsv {

    public static String[][] importDataFromCsv(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new
                FileInputStream(fileName), "GBK"));
        String[][] results;
        String line;
        List<String[]> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line.split(","));
        }
        results = new String[list.size()][list.get(0).length];
        for (int i = 0; i < list.size(); i++) {
            results[i] = list.get(i);
        }
        return results;
    }
}
