package yoy.ecommerce.controller;

import yoy.ecommerce.model.Pembelian;
import yoy.ecommerce.repository.PembelianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pembelian")
public class PembelianController {

    @Autowired
    private PembelianRepository pembelianRepository;

    @GetMapping
    public List<Pembelian> getAllPembelian() {
        return pembelianRepository.findAll();
    }

    @PostMapping
    public Pembelian createPembelian(@RequestBody Pembelian pembelian) {
        return pembelianRepository.save(pembelian);
    }
}
