1. create HelloWorld.java with text:
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world");
    }
}
and save file;

2. run cmd (on Windows) in this directory and do this:
~\javac HelloWorld.java
~\jar -cf hello.jar HelloWorld.class

3. now we can run our *.jar:
~\java -cp hello.jar HelloWorld.class
