package com.example.box;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class BoxController {


    private final BoxRepository boxRepository;

    @GetMapping("ok")
    public String hello() {
        return "hello world";
    }
    @PostMapping()
    public ResponseEntity<BoxEntity> create(@RequestBody BoxEntity boxEntity) {
        return ResponseEntity.ok(boxRepository.save(boxEntity));
    }

    @GetMapping()
    public ResponseEntity<List<BoxEntity>> getAll() {
        return ResponseEntity.ok(boxRepository.findAll());
    }


}
