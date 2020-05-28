package com.Spring.Start.Lesson_23_Worker_messages.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WorkerSchedulce {

    static int i = 1;

    @Scheduled(initialDelay = 1000,fixedDelayString = "${schedule.work}")
    public void runFirst() throws InterruptedException {
        System.out.println("First start:" + ++i);
        Thread.sleep(5000);
        System.out.println("Finish start:" + i);
    }
    @Scheduled(fixedRate = 5000)
    public void runSecond() throws InterruptedException {
        System.out.println("Second start:" + ++i);
        Thread.sleep(5000);
        System.out.println("Second start:" + i);
    }
}
