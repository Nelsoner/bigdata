package com.mryao.bigdata.controller;

import com.mryao.bigdata.entity.ResultDataProvince;
import com.mryao.bigdata.entity.ResultDataYear;
import com.mryao.bigdata.service.IResultDataProvinceService;
import com.mryao.bigdata.service.IResultDataYearService;
import com.mryao.bigdata.utils.QueryHiveUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 20:16
 * @Description: 结果库api（黄伟）
 * @Version: 1.0
 */
@Api("结果库api")
@RestController
@RequestMapping("/result_Data")
public class ResultDataController {

    @Autowired
    private IResultDataYearService resultDataYearService;

    @Autowired
    private IResultDataProvinceService resultDataProvinceService;

    @ApiOperation("查询所有结果")
    @GetMapping("/Year")
    private List<ResultDataYear> listYear(){
        //直接调用hive

        return  resultDataYearService.findAll();
    }

    @ApiOperation("添加所有结果")
    @GetMapping("/Year/add")
    private List<ResultDataYear> addYear(){
        List<ResultDataYear> list = QueryHiveUtils.getResultDataYear();
        for (int i = 0; i < list.size(); i++) {
            resultDataYearService.save(list.get(i));
        }
        return list;
    }

    @ApiOperation("查询所有结果")
    @GetMapping("/Province")
    private List<ResultDataProvince> listProvince(){
        return  resultDataProvinceService.findAll();
    }

    @ApiOperation("添加所有结果")
    @GetMapping("/Province/add")
    private List<ResultDataProvince> addProvince(){
        List<ResultDataProvince> list = QueryHiveUtils.getResultDataProvince();
        for (int i = 0; i < list.size(); i++) {
            resultDataProvinceService.save(list.get(i));
        }
        return list;
    }





}
