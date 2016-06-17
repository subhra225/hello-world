import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void it_should_return_a_string_if_nothing_is_passed() {
        assertEquals("Hello, World!", HelloWorld.hello(""));
        assertEquals("Hello, World!", HelloWorld.hello(null));
    }

    @Test
    public void helloSampleName() {
        assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
    }

    @Test
    public void helloAnotherSampleName() {
        assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
    }
}

ssh-keygen
c:\sadasd\.ssh\id_rsa.pub