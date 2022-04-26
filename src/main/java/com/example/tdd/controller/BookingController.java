package com.example.tdd.controller;

import com.example.tdd.model.BookingModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BookingController {

    @GetMapping
    @ResponseBody
    public String getAll() {
        return "ok";
    }

    @PostMapping
    public ResponseEntity<BookingModel> save(BookingModel bookingModel) {
        return ResponseEntity.status(HttpStatus.OK).body(bookingModel);
    }
}
