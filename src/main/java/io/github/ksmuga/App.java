package io.github.ksmuga;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



//HTTP - hyper text transfer protocol
//URL - adres źródłamvn -N io.takari:maven:0.7.6:wrapper
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        var logger = LoggerFactory.getLogger(App.class);
        BasicConfigurator.configure();


        logger.info("Hello World");
    }
}