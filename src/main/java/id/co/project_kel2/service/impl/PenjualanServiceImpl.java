package id.co.project_kel2.service.impl;

import id.co.project_kel2.dao.PenjualanDao;
import id.co.project_kel2.model.DetailPenjualan;
import id.co.project_kel2.model.DetailPenjualanPK;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.model.Penjualan;
import id.co.project_kel2.repository.DetailPenjualanRepository;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.repository.PenjualanRepository;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.PenjualanService;
import id.co.project_kel2.vo.DetailPenjualanVo;
import id.co.project_kel2.vo.PenjualanVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static id.co.project_kel2.constant.ObatConstant.*;

@Service
@Transactional
public class PenjualanServiceImpl implements PenjualanService {
    @Autowired
    private PenjualanDao transaksiDao;

    @Autowired
    private PenjualanRepository penjualanRepository;
    @Autowired
    private DetailPenjualanRepository detailPenjualanRepository;
    @Autowired
    private ObatRepository obatRepository;

    @Override
    public DtoResponse savePenjualan(PenjualanVo penjualanVo) {
        Date tanggal = new Date();

        Penjualan penjualan = new Penjualan();
        penjualan.setTrs_tanggal(tanggal);

        List<DetailPenjualanVo> detailPenjualanVos = penjualanVo.getDetails();

        Penjualan savedPenjualan = penjualanRepository.save(penjualan);

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


}




