package oop.model.utilities.log;

/**
 * Created by mayukh42 on 2/6/17.
 */
public class MyLogger {

    private LogLevel level;
    private int depth;  // for testing only

    public MyLogger(LogLevel level) {
        this.level = level;
    }

    public void log(String message) {
        depth = logRec(message, level, 0);
    }

    /** logRec(): recursive logging function, which logs at all levels below it including itself
     * Meat of the Chain of Responsibility pattern
     */
    private int logRec(String message, LogLevel logLevel, int logDepth) {
        if (logLevel == null) return logDepth;

        System.out.println("[" + logLevel.name() + "] " + message);
        logLevel = logLevel.previous();
        return logRec(message, logLevel, logDepth+1);
    }

    public int getDepth() {
        return depth;
    }

    public LogLevel getLevel() {
        return level;
    }
}
