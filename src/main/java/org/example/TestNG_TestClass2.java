package org.example;

import org.testng.annotations.*;

public class TestNG_TestClass2 extends BaseTestSuite {

    @BeforeClass(alwaysRun = true)  //Iff have setup in testNG.xml to run the group, this BeforeClass/AfterClass will not run unless set alwaysRun is true
    public void setUp() {
        System.out.println("\nTestNG_TestClass2 -> before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("\nTestNG_TestClass2 -> after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nTestNG_TestClass2 -> before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\nTestNG_TestClass2 -> after method");
    }

    @Test(groups = {"regression"})
    public void someTestMethod() {
        System.out.println("TestNG_TestClass2 -> test method");
    }

    @Test(groups = {"smoke", "regression"})
    public void someTestMethod1() {
        System.out.println("TestNG_TestClass2 -> test method");
    }
    @Test(groups = {"smoke"})
    public void someTestMethod2() {
        System.out.println("TestNG_TestClass2 -> test method");
    }

}
