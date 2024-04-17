package id.co.project_kel2.dao.impl;

import id.co.project_kel2.dao.DetailPenjualanDao;
import id.co.project_kel2.model.DetailPenjualan;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.repository.DetailPenjualanRepository;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.repository.PenjualanRepository;
import id.co.project_kel2.vo.DetailPenjualanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class DetailPenjualanDaoImpl implements DetailPenjualanDao {

    @Autowired
    private DetailPenjualanRepository detailPenjualanRepository;
    @Autowired
    private PenjualanRepository penjualanRepository;
    @Autowired
    private ObatRepository obatRepository;
}



    /*public List<DetailPenjualanVo> getAllDetailPenjualan(){
        Iterable<DetailPenjualan> detailPenjualan = detailPenjualanRepository.findAll();
        List<DetailPenjualanVo> detailPenjualanVos = new ArrayList<>();
        for (DetailPenjualan item: detailPenjualan){
            DetailPenjualanVo detailPenjualanVo = new DetailPenjualanVo(item);

            /*Obat obat = obatRepository.findById(detailPenjualanVo.getId()).orElseThrow();
            detailPenjualanVo.set(buku.getNama());
            Peminjaman peminjaman = peminjamanRepository.findById(detailPeminjamanVo.getId_trs()).orElseThrow();
            detailPeminjamanVo.setTrs_desc(peminjaman.getNama_peminjam());



            detailPenjualanVos.add(detailPenjualanVo);
        }
        return detailPenjualanVos;
    }
    */
