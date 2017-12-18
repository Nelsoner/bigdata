package com.mryao.bigdata.service;

import com.mryao.bigdata.entity.ResultDataProvince;

import java.util.List;

/**  
 *  
 * @author Nelsoner 蒋酱酱
 * @date 2017/12/18 12:09  
 * 描述: Province
 * @param   
 * @return   
 */ 
public interface IResultDataProvinceService {
    List<ResultDataProvince> findAll();
    void save(ResultDataProvince resultDataProvince);
}
