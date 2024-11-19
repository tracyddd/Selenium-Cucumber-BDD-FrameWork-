package utils;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

public class ReporterLogger {
    private static final Logger logger = (Logger) LogManager.getLogger(ReporterLogger.class);

    public static void log(String message) {
        // Log to TestNG report
        Reporter.log(message, true);  // The second parameter (true) prints the message in the console as well

        // Log to Log4j2
        logger.info(message);
    }
}
