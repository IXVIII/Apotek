package id.co.project_kel2.service.impl;

import id.co.project_kel2.dao.ObatDao;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.ObatService;
import id.co.project_kel2.vo.ObatVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static id.co.project_kel2.constant.ObatConstant.*;

@Service
@Transactional
public class ObatServiceImpl implements ObatService {
    @Autowired
    private ObatDao obatDao;

    @Autowired
    private ObatRepository obatRepository;

    @Override
    public DtoResponse getAllObats() {
        if(obatDao.getAllObats() != null) {
            return new DtoResponse(200, obatDao.getAllObats());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse getObatActive() {
        if(obatDao.getObatActive() != null) {
            return new DtoResponse(200, obatDao.getObatActive());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse saveObat(Obat obat) {
        // Memeriksa apakah ada input yang kosong
        if (obat.getObt_nama() == null || obat.getObt_nama().isEmpty() ||
                obat.getObt_kegunaan() == null || obat.getObt_kegunaan().isEmpty() ||
                obat.getObt_hrg_jual() == null ||
                obat.getObt_stok() == null) {
            return new DtoResponse(400, null, "Semua kolom harus diisi");
        }

        try {
            obatRepository.save(obat);
            return new DtoResponse(200, obat, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, obat, mCreateFailed);
        }
    }


    @Override
    public DtoResponse updateObat (Obat obat) {
        try{

            Obat obat1 = obatRepository.findById(obat.getObt_id()).orElse(null);

            if(obat1 != null){
                // Update only if the new value is not null
                if(obat.getObt_nama() != null){
                    obat1.setObt_nama(obat.getObt_nama());
                }
                if(obat.getObt_kegunaan() != null){
                    obat1.setObt_kegunaan(obat.getObt_kegunaan());
                }
                if(obat.getObt_hrg_jual() != null){
                    obat1.setObt_hrg_jual(obat.getObt_hrg_jual());
                }
                if(obat.getObt_stok() != null){
                    obat1.setObt_stok(obat.getObt_stok());
                }

                Obat updatedObat = obatRepository.save(obat1);
                if(updatedObat != null){
                    return new DtoResponse(200, updatedObat, mUpdateSuccess);
                } else {
                    return new DtoResponse(404, null, mNotFound);
                }
            } else {
                return new DtoResponse(404, null, mNotFound);
            }
        } catch (Exception e){
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteObat(Obat obat) {
        Obat obatData = obatRepository.findById(obat.getObt_id()).orElseThrow();
        if(obatData != null){
            try{
                obatData.setObt_status(0);

                obatRepository.save(obatData);

                return new DtoResponse(200,obatData,mDeleteSuccess);
            }catch (Exception e){
                return new DtoResponse(500,obatData,mDeleteFailed);
            }
        }
        return new DtoResponse(404,null,mNotFound);
    }

    @Override
    public DtoResponse aktifObat(Obat obat) {
        Obat obatDataAktif = obatRepository.findById(obat.getObt_id()).orElseThrow();
        if(obatDataAktif != null){
            try{
                obatDataAktif.setObt_status(1);

                obatRepository.save(obatDataAktif);

                return new DtoResponse(200,obatDataAktif,mDeleteSuccess);
            }catch (Exception e){
                return new DtoResponse(500,obatDataAktif,mDeleteFailed);
            }
        }
        return new DtoResponse(404,null,mNotFound);
    }


    @Override
    public DtoResponse getObatById(int id) {
        if(obatDao.getObatById(id) != null) {
            return new DtoResponse(200, obatDao.getObatById(id));
        }
        return new DtoResponse(200, null, mEmptyData);
    }

}
