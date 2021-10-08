package com.spring.boot.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledAction {
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println(("Time Now:" + new Date()));
	}

}
