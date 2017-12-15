package com.mryao.bigdata.service;

import com.mryao.bigdata.entity.RawData;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 19:45
 * @Description:
 * @Version: 1.0
 */
public interface IRawDaraService {
    List<RawData> list();
    RawData getById(String id);
}
