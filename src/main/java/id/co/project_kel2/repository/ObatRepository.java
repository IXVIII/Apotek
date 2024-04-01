package id.co.project_kel2.repository;

import id.co.project_kel2.model.Obat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static id.co.project_kel2.constant.ObatConstant.qAllDataActive;

@Repository
public interface ObatRepository extends JpaRepository<Obat, Integer> {
    @Query(value = qAllDataActive, nativeQuery = true)
    List<Obat> findByStatus(int status);
}
