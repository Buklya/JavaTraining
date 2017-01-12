package ua.lnikolenko.filemanager;

import java.io.*;

public class FileManager {

    public static int calculateFiles(String path){
        int count = 0;
        File file = new File(path);
        if(file.exists()){
            File[] files = file.listFiles();
            if (files != null) {
                for (File fileItem : files) {
                    if(fileItem.isDirectory()){
                        count += calculateFiles(fileItem.getPath());
                    }else{
                        count++;
                    }
                }
            }else{
                count++;
            }
        }
        return count;
    }

    public static int calculateDirs(String path){
        int count = 0;
        File file = new File(path);
        if(file.exists()){
            File[] files = file.listFiles();
            if(files != null){
                for (File fileItem : files) {
                    if(fileItem.isDirectory()){
                        count++;
                        count += calculateDirs(fileItem.getPath());
                    }
                }
            }
            else{
                count++;
            }
        }
        return count;
    }

    public static void copy(String from, String to)  {
        File source = new File(from);
        File dest = new File(to);
        if(source.isDirectory()){
            if(!dest.exists()){
                dest.mkdirs();
            }
            String [] files = source.list();
            for(String file : files){
                File srcFile = new File(source, file);
                File destFile = new File(dest, file);
                copy(srcFile.getPath(), destFile.getPath());
            }
        }else {
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                inputStream = new BufferedInputStream(new FileInputStream(from));
                outputStream = new BufferedOutputStream(new FileOutputStream(to));
                int value;
                while ((value = inputStream.read()) != -1) {
                    outputStream.write(value);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    inputStream.close();
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void move(String from, String to) {
        copy(from, to);
        File source = new File(from);
        delete(source);
    }

    public static void delete(File source){
        if (source.isDirectory() && source.listFiles().length != 0) {
            File files[] = source.listFiles();
            for (File file : files) {
                delete(file);
            }
        }
        if ((source.isDirectory() && source.listFiles().length == 0) || source.isFile()) {
            source.delete();
        }
    }
}
