package by.epam.learn.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {
    static Logger Logger = LogManager.getLogger();
    public static void main(String[] args) {
    Logger.info("info first prg");
    Logger.log(Level.WARN, "Warning! Loggers!");
    try{
        throw new RuntimeException("Exception 1");
    } catch (RuntimeException e){
        Logger.log(Level.ERROR, "runtime",e);
    }
    }
}
