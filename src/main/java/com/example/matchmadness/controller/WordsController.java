package com.example.matchmadness.controller;


import com.example.matchmadness.model.Word;
import com.example.matchmadness.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/words")
public class WordsController {

    @Autowired
    private WordRepository wordRepository;

    @GetMapping
    List<Word> wordList() {
        return wordRepository.findAll();
    }
}
