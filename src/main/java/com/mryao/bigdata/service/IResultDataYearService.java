package com.mryao.bigdata.service;

import com.mryao.bigdata.entity.ResultDataProvince;
import com.mryao.bigdata.entity.ResultDataYear;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 20:14
 * @Description:
 * @Version: 1.0
 */
public interface IResultDataYearService {
    List<ResultDataYear> findAll();
    void save(ResultDataYear resultDataYear);
}
