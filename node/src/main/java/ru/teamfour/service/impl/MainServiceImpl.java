package ru.teamfour.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.teamfour.service.api.MainService;
import ru.teamfour.service.api.ProducerService;

@Service
public class MainServiceImpl implements MainService {
    private final ProducerService service;

    public MainServiceImpl(@Qualifier("producerServiceImpl") ProducerService service) {
        this.service = service;
    }

    @Override
    public void processTextMessage(Update update) {
        //saveTask(update);
    }


}
