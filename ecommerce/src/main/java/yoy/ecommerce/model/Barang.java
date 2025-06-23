package yoy.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barang") // pastikan sesuai dengan nama kolom di DB
    private Long id;

    private String nama;

    private Integer stok;

    private Double harga;

    @ManyToOne
    @JoinColumn(name = "id_toko") // sesuaikan dengan nama kolom di DB
    private Toko toko;

    @Column(name = "image_url")
    private String image_url;
}
