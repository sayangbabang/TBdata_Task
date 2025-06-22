package yoy.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yoy.ecommerce.model.Toko;
import yoy.ecommerce.repository.TokoRepository;

@RestController
@RequestMapping("/api/toko")
public class TokoController {

    @Autowired
    private TokoRepository tokoRepository;

    @GetMapping
    public List<Toko> getAllToko() {
        return tokoRepository.findAll();
    }

    @PostMapping
    public Toko createToko(@RequestBody Toko toko) {
        return tokoRepository.save(toko);
    }
}
