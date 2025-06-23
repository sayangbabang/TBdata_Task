package yoy.ecommerce.controller;

import yoy.ecommerce.model.Barang;
import yoy.ecommerce.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/barang")
public class BarangController {

    @Autowired
    private BarangRepository barangRepository;

    @GetMapping
    public List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    @PostMapping
    public Barang createBarang(@RequestBody Barang barang) {
        return barangRepository.save(barang);
    }
    
}
