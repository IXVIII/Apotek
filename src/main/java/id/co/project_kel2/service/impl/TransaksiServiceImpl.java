package id.co.project_kel2.service.impl;

import id.co.project_kel2.dao.TransaksiDao;
import id.co.project_kel2.model.DetailTransaksi;
import id.co.project_kel2.model.DetailTransaksiPK;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.model.Transaksi;
import id.co.project_kel2.repository.DetailTransaksiRepository;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.repository.TransaksiRepository;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.TransaksiService;
import id.co.project_kel2.vo.DetailTransaksiVoForm;
import id.co.project_kel2.vo.TransaksiVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static id.co.project_kel2.constant.ObatConstant.mEmptyData;

@Service
@Transactional
public class TransaksiServiceImpl implements TransaksiService {
    @Autowired
    private TransaksiDao transaksiDao;

    @Autowired
    private TransaksiRepository penjualanRepository;
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;
    @Autowired
    private ObatRepository obatRepository;
    @Autowired
    private DetailTransaksiServiceImpl detailTransaksiService;

    @Override
    public DtoResponse savePenjualan(TransaksiVo penjualanVo) {
        try{
            Date tanggal = new Date();

            Transaksi penjualan = new Transaksi();
            penjualan.setTrs_tanggal(tanggal);
            penjualan.setTrs_total(penjualanVo.getTotal());

            id.co.project_kel2.model.Transaksi savedPenjualan = penjualanRepository.save(penjualan);
//
//            Integer nextDetailId = detailTransaksiRepository.getNextDetailId();
//            DetailTransaksiPK detailTransaksiPK = new DetailTransaksiPK();
//            detailTransaksiPK.setObt_id(1);
//            detailTransaksiPK.setTrs_id(1);
//            detailTransaksiPK.setTrsdtl_id(nextDetailId);

//            DetailTransaksi detailTransaksi = new DetailTransaksi();
//            detailTransaksi.setDetailTransaksiPK(detailTransaksiPK);
//            detailTransaksi.setJumlah_obt(10);
//
//            id.co.project_kel2.model.DetailTransaksi savedDetailTransaksi = detailTransaksiRepository.save(detailTransaksi);

            return new DtoResponse(200, savedPenjualan, "Penjualan berhasil disimpan.");
        }catch (Exception e){
            return new DtoResponse(500, e, "Penyimpanan penjualan gagal");
        }
    }

    @Override
    public DtoResponse getPenjualan() {
        if(transaksiDao.getAllTransaksi() != null) {
            return new DtoResponse(200, transaksiDao.getAllTransaksi());
        }
        return new DtoResponse(200, null, mEmptyData);
    }


}




