package oop.model.utilities.log;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * Log Levels
 * TODO: have different output media for different log levels
 */
public enum LogLevel {

    INFO, WARNING, ERROR, FATAL;

    public LogLevel previous() {
        if (this.equals(FATAL)) return ERROR;
        else if (this.equals(ERROR)) return WARNING;
        else if (this.equals(WARNING)) return INFO;
        else return null;
    }
}
