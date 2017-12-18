package com.mryao.bigdata.controller;

import com.mryao.bigdata.entity.RawData;
import com.mryao.bigdata.service.IRawDaraService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 19:50
 * @Version: 1.0
 */
@Api("原始数据api")
@RestController
@RequestMapping("/raw_data")
public class RawDataController {

    @Autowired
    private IRawDaraService rawDaraService;

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 12:01
     * 描述:爬虫结果列表
     * @param []
     * @return java.util.List<com.mryao.bigdata.entity.RawData>
     */
    @ApiOperation("查询所有原始数据")
    @GetMapping("/result")
    public List<RawData> list(){
        return rawDaraService.list();
    }

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 12:01
     * 描述:根据id查询具体的数据
     * @param [id]
     * @return com.mryao.bigdata.entity.RawData
     */
    @GetMapping("/result/{id}")
    public RawData getById(@PathVariable String id){
        return rawDaraService.getById(id);
    }


}
