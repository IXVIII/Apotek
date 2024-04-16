package id.co.project_kel2.dao.impl;

import id.co.project_kel2.dao.PenjualanDao;
import id.co.project_kel2.model.Penjualan;
import id.co.project_kel2.repository.DetailPenjualanRepository;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.repository.PenjualanRepository;
import id.co.project_kel2.vo.PenjualanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PenjualanDaoImpl implements PenjualanDao {
    @Autowired
    private PenjualanRepository penjualanRepository;
    @Override
    public List<PenjualanVo> getAllPenjualan(){
        Iterable<Penjualan> penjualans = penjualanRepository.findAll();
        List<PenjualanVo> penjualanVos = new ArrayList<>();
        for (Penjualan item: penjualans){
            PenjualanVo penjualanVo = new PenjualanVo(item);
            penjualanVos.add(penjualanVo);
        }
        return penjualanVos;
    }

}
