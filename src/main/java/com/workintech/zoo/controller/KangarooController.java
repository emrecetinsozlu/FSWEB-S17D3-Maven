package com.workintech.zoo.controller;


import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.exceptions.ZooException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kangaroos")
public class KangarooController {

    private final Map<Integer, Kangaroo> kangaroos =  new HashMap<Integer, Kangaroo>();

    @GetMapping
    public List<Kangaroo> getAllKangaroos() {
        return new ArrayList<Kangaroo>(kangaroos.values());
    }

    @GetMapping("/{id}")
    public Kangaroo getKangarooById(@PathVariable int id) {
        Kangaroo kangaroo = kangaroos.get(id);
        if (kangaroo == null) {
            throw new ZooException("Kangoroo bulunamadım id :" + id + "status : ", HttpStatus.NOT_FOUND);
        }
        return kangaroo;
    }

    @PostMapping
    public Kangaroo createKangaroo(@RequestBody Kangaroo kangaroo) {
        if(kangaroo.getId() == null){
            //exception
            throw new ZooException("Kangaroo id 0 dan büyük olmalı", HttpStatus.BAD_REQUEST);
        }
        kangaroos.put(kangaroo.getId(),kangaroo);
        return kangaroo;
    }

    @PutMapping("/{id}")
    public Kangaroo updateKangaroo(@PathVariable Integer id, @RequestBody Kangaroo kangaroo) {
        kangaroos.put(id, kangaroo);
        return kangaroo;
    }
    @DeleteMapping("/{id}")
    public Kangaroo deleteKangaroo(@PathVariable Integer id) {
        Kangaroo kangaroo = kangaroos.get(id);
        if(kangaroo == null) {
            throw new ZooException("Kangoroo bulunamadım id :" + id + "status : ", HttpStatus.NOT_FOUND);
        }
        kangaroos.remove(id);
        return kangaroo;
    }
}
