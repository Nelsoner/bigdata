package com.mryao.bigdata.service.impl;

import com.mryao.bigdata.dao.ResultDataYearRepository;
import com.mryao.bigdata.entity.ResultDataYear;
import com.mryao.bigdata.service.IResultDataYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Nelsoner 蒋酱酱
 * @date 2017/12/18 12:08
 * 描述: Year service
 * @param
 * @return
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
