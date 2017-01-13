package ua.lnikolenko.loganalyzer;

import ua.lnikolenko.loganalyzer.entity.LogToken;
import ua.lnikolenko.loganalyzer.io.LogReader;
import ua.lnikolenko.loganalyzer.io.parser.LogParser;

import java.io.File;
import java.util.ArrayList;

public class Starter{
    public static void main(String [] args){
        File file = new File("D:\\MyProjects\\Java\\JavaTraining\\LogAnalyzer\\src\\ua\\lnikolenko\\loganalyzer\\access_log.txt");
        LogReader logReader = new LogReader(file.getPath());
        ArrayList<LogToken> logTokens = logReader.read();
    }
    void print(ArrayList<LogToken> logTokens){
        for(int i = 0; i < logTokens.size(); i++){
            logTokens.get(i).toString();
        }
    }
   }