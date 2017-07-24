package com.globant;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
        System.out.println( "Enter your name: " );
        String name = scan.nextLine();
        // Exercise 1
        //System.out.println("Hello " + name);

        // Testing dependencies
        PropertyConfigurator.configure(App.class.getClassLoader().getResource("log4j.properties"));
        Logger logger = Logger.getLogger(App.class);
        logger.info(name);
    }
}
