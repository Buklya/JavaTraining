package ua.trubin.loganalyzer.io.parser;

import ua.trubin.loganalyzer.entity.HttpMethod;
import ua.trubin.loganalyzer.entity.LogToken;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogParser{
    public static LogToken parser(String token){
        LogToken logToken = new LogToken();
        int start = token.indexOf("[") + 1;
        int end = token.indexOf(" ");
        String dateStr = token.substring(start, end);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:kk:mm:ss");
        logToken.time = LocalDateTime.parse(dateStr, formatter);
        int isGet = token.indexOf("GET");
        int isPOST = token.indexOf("POST");
        //logToken.method = isGet>isPOST ? new HttpMethod(GET)
        return logToken;
    }
}