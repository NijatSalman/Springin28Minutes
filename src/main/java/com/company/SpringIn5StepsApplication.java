package com.company;

import com.company.SpringLesson.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {


//	public static void main(String[] args) {
//		ApplicationContext applicationContext= SpringApplication.run(SpringIn5StepsApplication.class, args);
//		BinarySearchImpl binarySearch= applicationContext.getBean(BinarySearchImpl.class);
//		binarySearch.binarySearch(5);
//	}

    private static Logger LOGGER= LoggerFactory.getLogger(SpringIn5StepsApplication.class);


    public static void main(String[] args) {
        ApplicationContext applicationContext= SpringApplication.run(SpringIn5StepsApplication.class, args);
        PersonDAO personDAO= applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2= applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}",personDAO);
        LOGGER.info("{}",personDAO.getJdbcConnection());

        LOGGER.info("{}",personDAO2);
        LOGGER.info("{}",personDAO2.getJdbcConnection());
        
        
    }

}
