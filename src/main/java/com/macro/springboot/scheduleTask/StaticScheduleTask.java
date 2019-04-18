package com.macro.springboot.scheduleTask;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Configuration
@EnableScheduling
public class StaticScheduleTask {

	//添加定时任务
	@Scheduled(cron = "0/5 * * * * ?")
	//或直接指定时间间隔，例如：5秒
	//@Scheduled(fixedRate=5000)
	private void configureTasks() {
		System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
	}

}
