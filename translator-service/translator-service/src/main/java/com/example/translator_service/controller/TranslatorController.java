package com.example.translator_service.controller;


import com.example.translator_service.service.TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/translate")
public class TranslatorController {
    public final TranslatorService translatorService;

    @Autowired
    public TranslatorController(TranslatorService translateService) {
        this.translatorService = translateService;
    }
@GetMapping
    public String translate(@RequestParam String text,
                            @RequestParam String targetLanguage) {
        return translatorService.translateText(text, targetLanguage);
    }
}