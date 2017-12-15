package com.mryao.bigdata.service.impl;

import com.mryao.bigdata.dao.RawDataRepository;
import com.mryao.bigdata.entity.RawData;
import com.mryao.bigdata.service.IRawDaraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 19:45
 * @Description:
 * @Version: 1.0
 */
@Service
public class RawDataServiceImpl implements IRawDaraService {

    @Autowired
    private RawDataRepository rawDataRepository;

    @Override
    public List<RawData> list() {
        return rawDataRepository.findAll();
    }

    @Override
    public RawData getById(String id) {
        return rawDataRepository.getOne(id);
    }

}
