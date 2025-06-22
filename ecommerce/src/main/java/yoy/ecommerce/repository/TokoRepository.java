package yoy.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yoy.ecommerce.model.Toko;

@Repository
public interface TokoRepository extends JpaRepository<Toko, Long> {
}
