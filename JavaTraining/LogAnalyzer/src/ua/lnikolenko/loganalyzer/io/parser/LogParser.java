package ua.lnikolenko.loganalyzer.io.parser;

import ua.lnikolenko.loganalyzer.entity.LogToken;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogParser{
    public static LogToken parser(String token){
        LogToken logToken = new LogToken();
        logToken.time = parseDateTime(token);
        logToken.method =  parseMethod(token);
        logToken.message = parseMessage(token);
        return logToken;
    }
    public static LocalDateTime parseDateTime(String token){
        int start = token.indexOf("[") + 1;
        int end = token.indexOf(" ", start);
        String dateStr = token.substring(start, end);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:kk:mm:ss");
        return LocalDateTime.parse(dateStr, formatter);
    }

    public static String parseMethod(String token){
        if(token.contains("GET")){
            return "GET";
        }else if(token.contains("POST")){
            return "POST";
        }
        return null;
    }

    public static String parseMessage(String token){
        int start = token.indexOf(" /") + 1;
        int end = token.indexOf("\"", start);
        return token.substring(start, end);
    }

}