package id.co.project_kel2.service.impl;

import id.co.project_kel2.dao.ObatDao;
import id.co.project_kel2.model.Obat;
import id.co.project_kel2.repository.ObatRepository;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.ObatService;
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
    public DtoResponse saveObat (Obat obat) {
        try {
            obatRepository.save(obat);
            return new DtoResponse(200, obat, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse (500, obat, mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateObat (Obat obat) {
        try {
            Obat updatedObat = obatRepository.save(obat);
            if (updatedObat != null) {
                return new DtoResponse(200, updatedObat, mUpdateSuccess);
            } else {
                return new DtoResponse (404, null, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteObat (Obat obat) {
        Obat obatData = obatRepository.findById(obat.getObt_id()).orElseThrow();
        if(obatData != null) {
            try {
                obatRepository.delete(obat);
                return new DtoResponse (200, obatData, mDeleteSuccess);
            } catch (Exception e) {
                return new DtoResponse(500, obatData, mDeleteFailed);
            }
        }
        return new DtoResponse (404, null, mNotFound);
    }
}
