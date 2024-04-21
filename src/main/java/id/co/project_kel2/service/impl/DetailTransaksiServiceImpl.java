package id.co.project_kel2.service.impl;


import id.co.project_kel2.dao.DetailTransaksiDao;
import id.co.project_kel2.dao.TransaksiDao;
import id.co.project_kel2.model.DetailTransaksi;
import id.co.project_kel2.model.DetailTransaksiPK;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.model.Transaksi;
import id.co.project_kel2.repository.DetailTransaksiRepository;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.DetailTransaksiService;
import id.co.project_kel2.vo.DetailTransaksiVo;
import id.co.project_kel2.vo.DetailTransaksiVoForm;
import id.co.project_kel2.vo.TransaksiVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import static id.co.project_kel2.constant.DetailConstant.*;


@Service
@Transactional
public class DetailTransaksiServiceImpl implements DetailTransaksiService {
    @Autowired
    private DetailTransaksiDao detailTransaksiDao;
    @Autowired
    private TransaksiDao transaksiDao;
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    //nungguin transaksi
    //@Autowired
    //private TransaksiRepository transaksiRepository;
    @Autowired
    private ObatRepository obatRepository;

    @Override
    public DtoResponse getAllDetails() {
        if(detailTransaksiDao.getAllDetails() != null) {
            return new DtoResponse(200, detailTransaksiDao.getAllDetails());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

//    @Override
//    public DtoResponse saveDetail (DetailTransaksiVoForm detailTransaksiVoForm) {
//        try {
//
//            //Nunggu Transaksi
//            //fungsi validasi untuk ngecek apakah skema atau prodi tersedia atau tidak
//            //Transaksi transaksi = transaksiRepository.findById(detailTransaksiVoForm.getTrsId()).orElse(null);
//            //if (transaksi == null) {
//            //    return new DtoResponse(404, null, "Transaksi is invalid");
//            //}
//
//            Obat obat = obatRepository.findById(detailTransaksiVoForm.getObtId()).orElse(null);
//            if (obat == null) {
//                return new DtoResponse(404, null, "Obat is invalid");
//            }
//
//            DetailTransaksiPK detailTransaksiPK = new DetailTransaksiPK();
//            //nunggu transaksi
//            detailTransaksiPK.setTrs_id(detailTransaksiPK.getTrs_id());
//            detailTransaksiPK.setObt_id(detailTransaksiPK.getObt_id());
//
//            List<DetailTransaksiVo> listData = detailTransaksiDao.getAllDetails();
//            if(listData.isEmpty()){
//                detailTransaksiPK.setTrsdtl_id(1);
//            } else {
//                DetailTransaksiVo lastData = listData.get(listData.size() - 1);
//                detailTransaksiPK.setTrsdtl_id(lastData.getTrsdtlId()+1);
//            }
//
//            DetailTransaksi detailTransaksi = new DetailTransaksi();
//            detailTransaksi.setDetailTransaksiPK(detailTransaksiPK);
//
//            detailTransaksi.setJumlah_obt(detailTransaksiVoForm.getJumlahObt());
//
//            id.co.project_kel2.model.DetailTransaksi DetailTransaksi = detailTransaksiRepository.save(detailTransaksi);
//            //detailSkemaRepository.save(detailSkema);
//            return new DtoResponse(200, DetailTransaksi, mCreateSuccess);
//        } catch (Exception e) {
//            return new DtoResponse (500, detailTransaksiVoForm, mCreateFailed);
//        }
//    }

    @Override
    public DtoResponse saveDetail (DetailTransaksiVoForm detailTransaksiVoForm) {
        try{
            DetailTransaksiPK detailTransaksiPK = new DetailTransaksiPK();
            detailTransaksiPK.setObt_id(detailTransaksiVoForm.getObtId());
            detailTransaksiPK.setTrs_id(detailTransaksiVoForm.getTrsId());

            List<TransaksiVo> listDataTransaksi = transaksiDao.getAllTransaksi();
            if(listDataTransaksi.isEmpty()){
                detailTransaksiPK.setTrs_id(1);
            }else{
                TransaksiVo lastDataTransaksi = listDataTransaksi.get(listDataTransaksi.size() - 1);
                detailTransaksiPK.setTrs_id(lastDataTransaksi.getId()+1);
            }

            List<DetailTransaksiVo> listData = detailTransaksiDao.getAllDetails();
            if(listData.isEmpty()){
                detailTransaksiPK.setTrsdtl_id(1);
            }else{
                DetailTransaksiVo lastData = listData.get(listData.size() - 1);
                detailTransaksiPK.setTrsdtl_id(lastData.getTrsdtlId()+1);
            }
//            detailTransaksiPK.setTrsdtl_id(detailTransaksiVoForm.getTrsdtlId());

            DetailTransaksi detailTransaksi = new DetailTransaksi();
            detailTransaksi.setDetailTransaksiPK(detailTransaksiPK);
            detailTransaksi.setJumlah_obt(detailTransaksiVoForm.getJumlahObt());

            id.co.project_kel2.model.DetailTransaksi savedDetailTransaksi = detailTransaksiRepository.save(detailTransaksi);

            return new DtoResponse(200, savedDetailTransaksi, "Detail berhasil disimpan.");
        }catch (Exception e){
            return new DtoResponse(500, e, "Penyimpanan detail gagal");
        }
    }




}
