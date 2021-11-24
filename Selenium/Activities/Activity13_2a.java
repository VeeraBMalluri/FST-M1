package in.ibm.com.Selenium;

import java.io.IOException;

public class Activity13_2a 
{
  
    public static void main(String args[]) throws IOException 
    {
        
        String filePath = "C:\\Users\\09089O744\\Desktop\\IBM_FST_ew\\Selenium\\sample.xlsx";

        Activity13_2 objExcelFile = new Activity13_2();

        
        objExcelFile.writeExcel(filePath);
        
        
        objExcelFile.readExcel(filePath);
    }
}