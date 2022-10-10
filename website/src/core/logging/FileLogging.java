package core.logging;

public class FileLogging implements Logger{
    @Override
    public void log(String data) {
        System.out.println("File loglandı "+data);
    }
}
