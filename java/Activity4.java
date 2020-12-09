package activities;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class Activity4 {
    public void writeFile() {
        try {
            String content = "This is sample text content \n Not for any purpose";
            FileUtils.writeStringToFile(new File("sample.txt"), content, "UTF8");
            System.out.println("Cheers!!! File Created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        try {
            String content = FileUtils.readFileToString(new File("sample.txt"), "UTF8");
            System.out.println("File Contents as String : "+content);
            List<String> lines = FileUtils.readLines(new File("sample.txt"), "UTF8");
            for(String line : lines) {
                System.out.println("line: "+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        try {
            FileUtils.forceDelete(new File("sample.txt"));
            System.out.println("File Deleted ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void tempFiles() {
        try {
            File tempDir = FileUtils.getTempDirectory();
            System.out.println("Temp File name "+tempDir.getName());
            FileUtils.copyFileToDirectory(new File("sample.txt"), tempDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Activity4 activity4 = new Activity4();
        activity4.writeFile();
        activity4.readFile();
        //activity4.tempFiles();
        //activity4.deleteFile();
    }
}
