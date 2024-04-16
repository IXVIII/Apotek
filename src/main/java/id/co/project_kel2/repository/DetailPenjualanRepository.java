package id.co.project_kel2.repository;

import id.co.project_kel2.model.DetailPenjualan;
import id.co.project_kel2.model.DetailPenjualanPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailPenjualanRepository extends JpaRepository<DetailPenjualan, DetailPenjualanPK> {

}
