package excel;

import java.io.IOException;

/**
 * @Author guoqing
 * @createDate： 2018/1/27 18:41
 * @Description: ${Descriptions}
 */
public interface ReadExcel {

    String[][] readExcel(String fileName) throws IOException;

}
