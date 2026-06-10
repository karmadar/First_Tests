package Tests.Examples;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {


    @BeforeEach
    void startBrowser() {
        System.out.println("Browser has started");
    }

    @AfterEach
    void stopBrowser() {
        System.out.println("browser has stopped");
    }

    @Test
    void firstTest() {
        System.out.println("- - firstTest");
    }

    @Test
    void secondTest() {
        System.out.println("- - secondTest");
    }
}