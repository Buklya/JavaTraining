package ua.lnikolenko.loganalyzer.entity;

import java.time.*;

public class LogToken {
    public LocalDateTime time;
    public String method;
    public String message;

    public String toString(){
        return "<time>" + time.toString() + "<method>" + method + "<message>" + message;
    }
}