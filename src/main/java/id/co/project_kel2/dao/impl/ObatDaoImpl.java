package id.co.project_kel2.dao.impl;

import id.co.project_kel2.dao.ObatDao;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.vo.ObatVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ObatDaoImpl implements ObatDao {
    @Autowired
    private ObatRepository obatRepository;

    @Override
    public List<ObatVo> getAllObats() {
        Iterable<Obat> obats = obatRepository.findAll();
        List<ObatVo> obatVos = new ArrayList<>();
        for (Obat item: obats) {
            ObatVo obatVo = new ObatVo(item);
            obatVos.add(obatVo);
        }
        return obatVos;
    }

    @Override
    public List<ObatVo> getObatActive() {
        Iterable<Obat> obats = obatRepository.findByStatus(1);
        List<ObatVo> obatVos = new ArrayList<>();
        for (Obat item: obats) {
            ObatVo obatVo = new ObatVo(item);
            obatVos.add(obatVo);
        }
        return obatVos;
    }
}
