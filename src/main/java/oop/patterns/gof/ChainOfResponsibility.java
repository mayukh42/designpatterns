package oop.patterns.gof;

import oop.model.utilities.log.MyLogger;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * The Chain of Responsibility design pattern
 *  Variant 1: Linear Recursive processing: LinkedList
 *  Variant 2: Tree (Branch) Recursion: DispatchServlet
 */
public class ChainOfResponsibility {

    /** The logger logs messages for its level and all levels below it. So depending on the log level, the chain
     *  of responibility is delegated to the previous level.
     */
    public int logMessage(MyLogger logger, String message) {
        logger.log(message);
        return logger.getDepth();
    }
}
