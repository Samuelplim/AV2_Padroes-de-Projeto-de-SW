package main;

import entities.*;

public class main {

    public static void main(String[] args) {
        CachedLoggingProxy logger = new CachedLoggingProxy();
        for(int i = 1; i<5; i++){
            logger.logRequest("logString "+i);
        }
    }
    
}
