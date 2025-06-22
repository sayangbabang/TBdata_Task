package yoy.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yoy.ecommerce.model.Pembelian;

@Repository
public interface PembelianRepository extends JpaRepository<Pembelian, Long> {
}
