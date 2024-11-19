package org.example;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTestSuite {

    @BeforeClass
    public void beforeClass() {
        // This method will be executed before any test class that extends BaseTestSuite
        System.out.println("BestTesSuite.Java: beforeClass");
    }

    @AfterClass
    public void afterClass() {
        // This method will be executed after all tests in any test class that extends BaseTestSuite
        System.out.println("BestTesSuite.Java: afterClass");
    }

    @BeforeSuite
    public void beforeSuite() {
        // This method will be executed once before the entire test suite
        System.out.println("BestTesSuite.Java:beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        // This method will be executed once after the entire test suite
        System.out.println("BestTesSuite.Java: afterSuite");
    }
}
