package core.logging;

public class DatabaseLogging implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanı loglandı "+data);
    }
}
