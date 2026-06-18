package com.workintech.zoo.controller;


import com.workintech.zoo.entity.Koala;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {

    private final Map<Integer, Koala> koalas = new HashMap<>();

    @GetMapping
    public List<Koala> getAllKoalas() {
        return new ArrayList<>(koalas.values());
    }
    @GetMapping("/{id}")
    public Koala getKoalaById(@PathVariable Integer id) {
        return koalas.get(id);
    }
    @PostMapping
    public Koala saveKoala(@RequestBody Koala koala) {
        koalas.put(koala.getId(), koala);
        return koala;
    }

    @PutMapping("/{id}")
    public Koala updateKoala(@PathVariable Integer id,@RequestBody Koala koala){
        koalas.put(id, koala);
        return koala;
    }

    @DeleteMapping("/{id}")
    public void deleteKoala(@PathVariable Integer id){
        koalas.remove(id);
    }
}
