package id.co.project_kel2.dao.impl;

import id.co.project_kel2.dao.DetailTransaksiDao;
import id.co.project_kel2.model.DetailTransaksi;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.repository.DetailTransaksiRepository;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.vo.DetailTransaksiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DetailTransaksiDaoImpl implements DetailTransaksiDao {
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    //nungguin transaksi
    //@Autowired
    //private TransaksiRepository transaksiRepository;

    @Autowired
    private ObatRepository obatRepository;

    @Override
    public List<DetailTransaksiVo> getAllDetails() {
        Iterable<DetailTransaksi> details = detailTransaksiRepository.findAll();
        List<DetailTransaksiVo> detailTransaksiVos = new ArrayList<>();
        for (DetailTransaksi item: details) {
            DetailTransaksiVo detailTransaksiVo = new DetailTransaksiVo(item);

            //Transaksi transaksi = transaksiRepository.findById(detailSkemaVo.getSkmId()).orElseThrow();
            //detailSkemaVo.setSkmDesc(skema.getSkm_nama());

            Obat obat = obatRepository.findById(detailTransaksiVo.getObtId()).orElseThrow();
            detailTransaksiVo.setObt_nama(obat.getObt_nama());

            detailTransaksiVos.add(detailTransaksiVo);
        }
        return detailTransaksiVos;
    }


}
