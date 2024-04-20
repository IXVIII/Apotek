package id.co.project_kel2.service.impl;

import id.co.project_kel2.dao.TransaksiDao;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.model.Transaksi;
import id.co.project_kel2.repository.DetailTransaksiRepository;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.repository.TransaksiRepository;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.TransaksiService;
import id.co.project_kel2.vo.TransaksiVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
/*
    @Override
    public DtoResponse savePenjualan(TransaksiVo penjualanVo) {
        Date tanggal = new Date();

        Transaksi penjualan = new Transaksi();
        penjualan.setTrs_tanggal(tanggal);

        List<DetailPenjualanVo> detailPenjualanVos = penjualanVo.getDetails();

        Transaksi savedPenjualan = penjualanRepository.save(penjualan);

        BigDecimal total = BigDecimal.ZERO;
        for (DetailPenjualanVo detailVo : detailPenjualanVos) {
            Obat obat = obatRepository.findById(detailVo.getObt_id()).orElse(null);
            if (obat == null) {
                return new DtoResponse(400, null, "Obat dengan ID " + detailVo.getObt_id() + " tidak ditemukan.");
            }
            BigDecimal subtotal = obat.getObt_hrgJual().multiply(new BigDecimal(detailVo.getJumlah()));
            total = total.add(subtotal);

            DetailPenjualan detail = new DetailPenjualan();
            DetailPenjualanPK detailPenjualanPK = new DetailPenjualanPK();
            detailPenjualanPK.setTrs_id(savedPenjualan.getTrs_id());
            detailPenjualanPK.setObt_id(obat.getObt_id());
            detail.setDetailPenjualanPK(detailPenjualanPK);
            detail.setJumlah_obt(detailVo.getJumlah());
            DetailPenjualan detailPenjualan = detailPenjualanRepository.save(detail);
        }

        penjualan.setTrs_total(total);

        return new DtoResponse(200, savedPenjualan, "Penjualan berhasil disimpan.");



    }

         */


}




