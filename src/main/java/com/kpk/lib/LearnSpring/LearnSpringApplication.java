package com.kpk.lib.LearnSpring;

import com.kpk.lib.LearnSpring.collectionframework.LearnCollection;
import com.kpk.lib.LearnSpring.streamsframework.LearnStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LearnSpringApplication {

    /**
     * TODO boot the application
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(LearnSpringApplication.class, args);

    }

  /*  @Bean
    public TomcatServletWebServerFactory containerFactory() {
        return new TomcatServletWebServerFactory() {
            protected void customizeConnector(Connector connector) {
                int maxSize = 50000000;
                super.customizeConnector(connector);
                connector.setMaxPostSize(maxSize);
                connector.setMaxSavePostSize(maxSize);
                if (connector.getProtocolHandler() instanceof AbstractHttp11Protocol) {

                    ((AbstractHttp11Protocol <?>) connector.getProtocolHandler()).setMaxSwallowSize(maxSize);
                    logger.info("Set MaxSwallowSize "+ maxSize);
                }
            }
        };

    }*/
}
