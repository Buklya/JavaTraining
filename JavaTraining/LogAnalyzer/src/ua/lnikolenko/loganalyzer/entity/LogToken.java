package ua.trubin.loganalyzer.entity;

import java.time.*;

enum HttpMethod{GET, POST}

public class LogToken {
    public LocalDateTime time;
    public HttpMethod method;
    String message;
}