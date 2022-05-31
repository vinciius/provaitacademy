package com.ibm.microservicoprova;

import com.ibm.microservicoprova.utils.CSVReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/*@SpringBootApplication
public class MicroservicoprovaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroservicoprovaApplication.class, args);
    }
}*/

@SpringBootApplication
public class SpringBootConsoleApplication
        implements CommandLineRunner {

    private static Logger LOG = LoggerFactory
            .getLogger(SpringBootConsoleApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(SpringBootConsoleApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws IOException {
        LOG.info("EXECUTING : command line runner");
        LOG.info(String.valueOf(new CSVReader()));
        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
    }
}
