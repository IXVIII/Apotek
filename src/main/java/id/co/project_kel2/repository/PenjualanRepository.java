package id.co.project_kel2.repository;

import id.co.project_kel2.model.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenjualanRepository extends JpaRepository<Penjualan, Integer> {

}
