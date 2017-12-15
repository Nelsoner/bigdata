package com.mryao.bigdata.service.impl;

import com.mryao.bigdata.dao.ResultDataYearRepository;
import com.mryao.bigdata.entity.ResultDataYear;
import com.mryao.bigdata.service.IResultDataYearService;
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
public class ResultDataYearServiceImpl implements IResultDataYearService {

    @Autowired
    private ResultDataYearRepository resultDataRepository;

    @Override
    public List<ResultDataYear> findAll() {
        return resultDataRepository.findAll();
    }

    @Override
    public void save(ResultDataYear resultDataYear) {
        resultDataRepository.save(resultDataYear);
    }
}
