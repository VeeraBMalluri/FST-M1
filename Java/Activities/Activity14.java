package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 
{
    public static void main(String[] args) throws IOException 
    {
    	{
            try 
            {
                File file = new File("C:\\Users\\09089O744\\Desktop\\IBM_FST_ew\\JAVA\\file1.txt");
                boolean fStatus = file.createNewFile();
                if(fStatus) 
                {
                    System.out.println("File created successfully!");
                } 
                else 
                {
                    System.out.println("File already exists at this path.");
                }

                
                File fileUtil = FileUtils.getFile("C:\\Users\\09089O744\\Desktop\\IBM_FST_ew\\JAVA\\file1.txt");
                String str1 = "This is the file created by Java script";
                FileUtils.writeStringToFile(fileUtil, str1, "UTF8");
                
                System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

                
                File destDir = new File("C:\\Users\\09089O744\\Desktop\\IBM_FST_ew\\Resource");
               
                FileUtils.copyFileToDirectory(file, destDir);

               
                File newFile = FileUtils.getFile(destDir, "file1.txt");
                String str2 = "This is the copied file";
                FileUtils.writeStringToFile(newFile, str2, "UTF8");
                
                String newFileData = FileUtils.readFileToString(newFile, "UTF8");
                
                System.out.println("Data in new file: " + newFileData);
            } 
            catch(IOException errMessage) 
            {
                System.out.println(errMessage); 
            }
    }
   }
}

