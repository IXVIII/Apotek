package id.co.project_kel2.repository;

import id.co.project_kel2.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksi, Integer> {

}
