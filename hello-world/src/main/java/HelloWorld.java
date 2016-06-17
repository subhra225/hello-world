public class HelloWorld {

    public static String hello(String message)
    {
        if(message==""|| message==null)
        {

            return "Hello, World!";
        }
        return "Hello, "+ message + "!";
    }
}
