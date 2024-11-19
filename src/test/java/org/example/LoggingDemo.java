/*
test git
v2
*/

package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

/**
 * Unit test for simple App.
 */
public class LoggingDemo {
    private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());


    public static void main(String[] args) {
        log.debug("Log4j debug mode");
        log.info("Log4j info mode");
        int i = 0;
        log.error("Log4j error mode" + i);
        log.warn("Log4j warn mode");
        log.fatal("Log4j fatal mode");

        Reporter.log("Step 1: Open the browser", true);
        Reporter.log("Step 2: Navigate to the login page", true);
        Reporter.log("Step 3: Verify the login page is displayed", true);
        testMethod();
    }

        public static void testMethod() {
            log.info("Opening browser");
            log.debug("Navigating to login page");
            try {
                // Code that might throw an exception
            } catch (Exception e) {
                log.error("Error occurred while navigating to login page", e);
            }
        }

    }