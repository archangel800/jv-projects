package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    @org.junit.jupiter.api.Test
    void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}