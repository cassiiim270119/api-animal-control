package com.study.animalcontrol.spring.controller;

import com.study.animalcontrol.Animal;
import com.study.animalcontrol.spring.model.response.CreateAnimalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/animals")
public class CreateAnimalController {

    @GetMapping
    public ResponseEntity createAnimal() {
        return ResponseEntity.ok(CreateAnimalResponse.fromAnimal(Animal.builder()
                .name("Chatinha")
                .age(48)
                .inputPrice(4100.00)
                .inputDate(LocalDateTime.now())
                .build()));
    }
}
