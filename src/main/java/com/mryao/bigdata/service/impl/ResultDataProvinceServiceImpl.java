package com.mryao.bigdata.service.impl;

import com.mryao.bigdata.dao.ResultDataProvinceRepository;
import com.mryao.bigdata.entity.ResultDataProvince;
import com.mryao.bigdata.service.IResultDataProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 20:15
 * @Description:
 * @Version: 1.0
 */
@Service
public class ResultDataProvinceServiceImpl implements IResultDataProvinceService {

    @Autowired
    private ResultDataProvinceRepository resultDataProvinceRepository;

    @Override
    public List<ResultDataProvince> findAll() {
        return resultDataProvinceRepository.findAll();
    }

    @Override
    public void save(ResultDataProvince resultDataProvince) {
        resultDataProvinceRepository.save(resultDataProvince);
    }
}
