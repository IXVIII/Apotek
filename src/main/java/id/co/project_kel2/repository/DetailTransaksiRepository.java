package id.co.project_kel2.repository;

import id.co.project_kel2.model.DetailTransaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static id.co.project_kel2.constant.ObatConstant.qAllDataActive;

@Repository
public interface DetailTransaksiRepository extends JpaRepository<DetailTransaksi, Integer> {
//    @Query(value = qAllDataActive, nativeQuery = true)
//    List<DetailTransaksi> findByStatus(int status);

//    @Query("SELECT MAX(dtr.detailTransaksiPK.trsdtl_id) + 1 FROM DetailTransaksi dtr")
//    Integer getNextDetailId();

}
