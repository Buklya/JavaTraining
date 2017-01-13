package ua.lnikolenko.loganalyzer.io;

import ua.lnikolenko.loganalyzer.entity.LogToken;
import ua.lnikolenko.loganalyzer.io.parser.LogParser;

import java.io.*;
import java.util.ArrayList;

public class LogReader{
    String path;

    public LogReader(String path){
        this.path = path;
    }

    public ArrayList<LogToken> read(){
        ArrayList<LogToken> logTokens = new ArrayList<LogToken>();
        File file = new File(path);
        FileReader reader = null;
        try{
            reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                logTokens.add(LogParser.parser(value));
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }finally {
            try{
                reader.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
        return logTokens;
    }
}