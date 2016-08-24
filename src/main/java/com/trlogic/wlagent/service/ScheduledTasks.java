package com.trlogic.wlagent.service;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
    	 
    	log.info("Started Scheduled Job");
    	 
        System.out.println("The time is now " + dateFormat.format(new Date()));
       
    }
}