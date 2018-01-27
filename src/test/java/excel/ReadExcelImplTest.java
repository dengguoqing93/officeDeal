package excel; 


import excel.excelImpl.ReadExcelImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ReadExcelImpl Tester. 
* 
* @author $author
* @since <pre>01/27/2018</pre> 
* @version 1.0 
*/ 
public class ReadExcelImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: readXls(String fileName) 
* 
*/ 
@Test
public void testReadXls() throws Exception {

}

/** 
* 
* Method: readExcel(String fileName)
* 
*/ 
@Test
public void testReadXlsx() throws Exception {
    String fileName = "C:\\Users\\guoqing\\Desktop\\测试.xlsx";
    ReadExcel readExcel = new ReadExcelImpl();
    String[][] strings = readExcel.readExcel(fileName);
    for (String[] string : strings) {
        for (String s : string) {
            System.out.println(s);
        }
    }

} 


} 
