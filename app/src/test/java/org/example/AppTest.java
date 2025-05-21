package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void appHasAGreeting() {
        MyGradleApp classUnderTest = new MyGradleApp();
        assertNotNull(classUnderTest);
    }
}
