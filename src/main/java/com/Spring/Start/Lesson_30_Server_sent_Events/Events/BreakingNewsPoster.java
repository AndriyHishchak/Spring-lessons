package com.Spring.Start.Lesson_30_Server_sent_Events.Events;


import com.Spring.Start.Lesson_30_Server_sent_Events.Events.model.BreakingNews;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Component
public class BreakingNewsPoster {

    private ApplicationEventPublisher publisher;
    @Autowired
    public BreakingNewsPoster (ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        @PostMapping
            public void start() {
            executorService.schedule(this::action,5, TimeUnit.SECONDS);
        }

    private void action() {
            BreakingNews news = new BreakingNews();
            news.setData("news" + ThreadLocalRandom.current().nextInt(20));
            publisher.publishEvent(news);
            executorService.schedule(this::action,ThreadLocalRandom.current().nextInt(15), TimeUnit.SECONDS);
    }


}
