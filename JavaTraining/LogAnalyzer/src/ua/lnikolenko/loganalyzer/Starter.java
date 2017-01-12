package ua.trubin.loganalyzer;

import ua.trubin.loganalyzer.entity.LogToken;
import ua.trubin.loganalyzer.io.parser.LogParser;

public class Starter{
    public static void main(String [] args){
        LogToken logToken = new LogToken();
        logToken = LogParser.parser("[07/Mar/2004:16:06:51 -0800] \"GET /twiki/bin/rdiff/TWiki/NewUserTemplate?\"");
        System.out.println(logToken.time.toString());
    }

   }