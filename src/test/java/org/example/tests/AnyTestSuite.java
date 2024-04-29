package org.example.tests;

import org.example.base.MainTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AnyTestSuite  extends MainTest {

    @Test
    void verifySomething() {
        assertTrue(true);

        //mvn io.qameta.allure:allure-maven:serve
    }
}
