package com.holydayzer.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/holidays")
public class HolidayController {

    @Autowired
    private HolidayRepository holidayRepository;

    @GetMapping
    public Iterable<Holiday> getAllHolidays() {
        return holidayRepository.findAll();
    }

    @GetMapping("/{date}")
    public String getHoliday(@PathVariable String date) {
        Optional<Holiday> holidayOptional = holidayRepository.findById(date);
        return holidayOptional.map(holiday -> "Dia " + holiday.getDate() + " é " + holiday.getName() + "! 🎉")
                .orElse("Dia " + date + " não é feriado 🥲");
    }
}
