package ru.teamfour.service.api;

import org.telegram.telegrambots.meta.api.objects.Update;

/***
 * Для считывания сообщений из брокера
 */
public interface ConsumerService {

    void consumerTextMessageUpdates(Update update);

}
