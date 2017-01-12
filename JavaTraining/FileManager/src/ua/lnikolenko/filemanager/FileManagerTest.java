package ua.lnikolenko.filemanager;

import ua.lnikolenko.filemanager.FileManager;

public class FileManagerTest {
    public static void main(String [] args){
        System.out.println(FileManager.calculateFiles("C:\\Program Files"));
        System.out.println(FileManager.calculateDirs("C:\\Program Files"));
        FileManager.copy("D:\\Test\\Test1", "D:\\Test\\TestCopy2");
        FileManager.move("D:\\Test\\Test1", "D:\\Test\\TestCopy2");
    }
}
