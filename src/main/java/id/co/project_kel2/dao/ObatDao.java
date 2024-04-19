package id.co.project_kel2.dao;

import id.co.project_kel2.vo.ObatVo;

import java.util.List;

public interface ObatDao {
    List<ObatVo> getAllObats();
    List<ObatVo> getObatActive();

    ObatVo getObatById(int id);
    void deleteObat (int id);}
