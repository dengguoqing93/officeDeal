package excel.excelImpl;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ReadCsv Tester.
 *
 * @author $author
 * @version 1.0
 * @since <pre>01/28/2018</pre>
 */
public class ReadCsvTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: importDataFromCsv(String fileName)
     */
    @Test
    public void testImportDataFromCsv() throws Exception {
        String fileName = "C:\\Users\\guoqing\\Desktop\\测试.csv";
        for (String[] strings : ReadCsv.importDataFromCsv(fileName)) {
            for (String string : strings) {
                System.out.println(string);
            
            }
        }
    }


} 
