package com.Spring.Start.Lesson_30_Server_sent_Events.Events.controller;

import com.Spring.Start.Lesson_30_Server_sent_Events.Events.model.BreakingNews;
import lombok.val;
import org.springframework.context.event.EventListener;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import org.yaml.snakeyaml.emitter.Emitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@RestController
public class BNControllerRest {

    private final Set<SseEmitter> subcribers = new CopyOnWriteArraySet<>();

    @RequestMapping(method = RequestMethod.GET,value = "/news-stream")
    public SseEmitter events() {
        SseEmitter emitter = new SseEmitter(); // - відповідальний за конект (стає подпіпищиком)
        subcribers.add(emitter);

        emitter.onTimeout(()->subcribers.remove(emitter));
        emitter.onCompletion(()->subcribers.remove(emitter));
        return emitter;
    }
    @Async
    @EventListener
    public void handleNews(BreakingNews breakingNews) {
        List<SseEmitter> deadEmitter = new ArrayList<>();

        subcribers.forEach(
                emitter -> {
                    try{
                        emitter.send(breakingNews, MediaType.APPLICATION_JSON);
                    }catch (Exception e) {
                        deadEmitter.add(emitter);
                    }
                }
        );
        subcribers.removeAll(deadEmitter);
    }
}
