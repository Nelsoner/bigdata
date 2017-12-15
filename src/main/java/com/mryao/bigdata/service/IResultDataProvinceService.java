package com.mryao.bigdata.service;

import com.mryao.bigdata.entity.ResultDataProvince;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 20:14
 * @Description:
 * @Version: 1.0
 */
public interface IResultDataProvinceService {
    List<ResultDataProvince> findAll();
    void save(ResultDataProvince resultDataProvince);
}
