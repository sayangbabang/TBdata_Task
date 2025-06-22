package yoy.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yoy.ecommerce.model.Barang;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {
}
