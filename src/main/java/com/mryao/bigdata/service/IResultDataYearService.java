package com.mryao.bigdata.service;

import com.mryao.bigdata.entity.ResultDataProvince;
import com.mryao.bigdata.entity.ResultDataYear;

import java.util.List;

/**
 *
 * @author Nelsoner 蒋酱酱
 * @date 2017/12/18 12:09
 * 描述: Year
 * @param
 * @return
 */
public interface IResultDataYearService {
    List<ResultDataYear> findAll();
    void save(ResultDataYear resultDataYear);
}
