package entities;

public class CachedLogger implements IcachedLogging{

    @Override
    public void logRequest(String logString) {
        System.out.println("Cached Logger logging to some expensive resource: "+logString+"\n");
    }
    
}
