package org.example.service;

import org.example.entity.Currency;
import org.example.service.impl.HashMapCurrencyModeService;

public interface CurrencyModeService {
    //remembering currency for chatId chat and giving it
    static CurrencyModeService getInstance() {
        return new HashMapCurrencyModeService();
    }

    Currency getOriginalCurrency(long chatId);

    Currency getTargetCurrency(long chatId);

    void setOriginalCurrency(long chatId, Currency currency);

    void setTargetCurrency(long chatId, Currency currency);
}