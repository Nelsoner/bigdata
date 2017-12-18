package com.mryao.bigdata.service.impl;

import com.mryao.bigdata.dao.ResultDataProvinceRepository;
import com.mryao.bigdata.entity.ResultDataProvince;
import com.mryao.bigdata.service.IResultDataProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Nelsoner 蒋酱酱
 * @date 2017/12/18 12:08
 * 描述: Province service
 * @param
 * @return
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
