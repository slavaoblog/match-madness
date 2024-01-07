package com.example.matchmadness.component;

import com.example.matchmadness.model.Word;
import com.example.matchmadness.repository.WordRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class DataInitializer implements ApplicationRunner {

    @Autowired
    private final WordRepository wordRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Word> wordList = Arrays.asList(
                new Word("Haus", "house"),
                new Word("Licht", "light"),
                new Word("Witz", "joke"),
                new Word("Mann", "man"),
                new Word("Frau", "woman"),
                new Word("schnell", "quick"),
                new Word("groß", "large"),
                new Word("klein", "little"),
                new Word("Käse", "cheese"),
                new Word("Beruf", "profession"),
                new Word("Teil", "part"),
                new Word("Kind", "kid")
        );

        wordRepository.saveAll(wordList);
    }
}
