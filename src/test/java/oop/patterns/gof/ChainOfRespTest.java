package oop.patterns.gof;

import oop.model.utilities.log.LogLevel;
import oop.model.utilities.log.MyLogger;
import oop.patterns.gof.ChainOfResponsibility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 2/6/17.
 */
public class ChainOfRespTest {

    private final ChainOfResponsibility cor = new ChainOfResponsibility();

    @Test
    public void testLogLevelInfo() {
        MyLogger logger = new MyLogger(LogLevel.INFO);
        String message = "database connected";
        int logDepth = cor.logMessage(logger, message);
        assertEquals("Log depth should be 1", 1, logDepth);
    }

    @Test
    public void testLogLevelWarning() {
        MyLogger logger = new MyLogger(LogLevel.WARNING);
        String message = "query time exceeded allowable limit";
        int logDepth = cor.logMessage(logger, message);
        assertEquals("Log depth should be 2", 2, logDepth);
    }

    @Test
    public void testLogLevelError() {
        MyLogger logger = new MyLogger(LogLevel.ERROR);
        String message = "an sql exception occurred";
        int logDepth = cor.logMessage(logger, message);
        assertEquals("Log depth should be 3", 3, logDepth);
    }

    @Test
    public void testLogLevelDebug() {
        MyLogger logger = new MyLogger(LogLevel.FATAL);
        String message = "core dump";
        int logDepth = cor.logMessage(logger, message);
        assertEquals("Log depth should be 4", 4, logDepth);
    }
}
