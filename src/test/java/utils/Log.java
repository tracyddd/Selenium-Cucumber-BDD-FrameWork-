package utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {
    // Initialize Log4j instance
    private static final Logger logger = LogManager.getLogger(Log.class);

    // Info Level Logs
    public static void info(String message) {
        logger.info(message);
    }

    // Error Level Logs
    public static void error(String message) {
        logger.error(message);
    }

    // Debug Level Logs
    public static void debug(String message) {
        logger.debug(message);
    }

    // Warn Level Logs
    public static void warn(String message) {
        logger.warn(message);
    }

}
