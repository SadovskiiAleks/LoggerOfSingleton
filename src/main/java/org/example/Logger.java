package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss ");

        System.out.println(
                "[" + format.format(dateNow) +
                        num++ + "] " + msg
        );

    }

}
