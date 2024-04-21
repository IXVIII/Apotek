package id.co.project_kel2.dao.impl;

import id.co.project_kel2.dao.TransaksiDao;
import id.co.project_kel2.model.Transaksi;
import id.co.project_kel2.repository.TransaksiRepository;
import id.co.project_kel2.vo.TransaksiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransaksiDaoImpl implements TransaksiDao {
    @Autowired
    private TransaksiRepository penjualanRepository;
    @Override
    public List<TransaksiVo> getAllTransaksi(){
        Iterable<Transaksi> penjualans = penjualanRepository.findAll();
        List<TransaksiVo> penjualanVos = new ArrayList<>();
        for (Transaksi item: penjualans){
            TransaksiVo penjualanVo = new TransaksiVo(item);
            penjualanVos.add(penjualanVo);
        }
        return penjualanVos;
    }

//    @Override
//    public List<TransaksiVo> getAllTransaksi(){
//        Iterable<Transaksi> penjualans = penjualanRepository.findAll();
//        List<TransaksiVo> penjualanVos = new ArrayList<>();
//        for (Transaksi item: penjualans){
//            TransaksiVo penjualanVo = new TransaksiVo(item);
//            penjualanVos.add(penjualanVo);
//        }
//        return penjualanVos;
//    }



}
