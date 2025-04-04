package com.example.translator_service.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Service
public class TranslatorService {
    private final Map<String, String> mockTranslations;

    public TranslatorService() {
        mockTranslations = new HashMap<>();
        mockTranslations.put("hello-en-es", "hola");
        mockTranslations.put("world-en-fr", "monde");
    }

    public String translateText(String text, String targetLanguage){
        String key = text.toLowerCase(Locale.ROOT) + "-en-" + targetLanguage.toLowerCase();
        return mockTranslations.getOrDefault(key, "[Translation Unavailable]");
    }
}
