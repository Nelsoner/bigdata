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

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 12:03
     * 描述:获得数据库之前分析好的数据  年份
     * @param []
     * @return java.util.List<com.mryao.bigdata.entity.ResultDataYear>
     */
    @ApiOperation("之前分析好的数据-年份")
    @GetMapping("/Year")
    private List<ResultDataYear> listYear(){
        //直接调用hive

        return  resultDataYearService.findAll();
    }

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 12:04
     * 描述: 通过hive分析 得出结果 存入数据库 并返回
     * @param []
     * @return java.util.List<com.mryao.bigdata.entity.ResultDataYear>
     */
    @ApiOperation("通过hive分析-年份")
    @GetMapping("/Year/add")
    private List<ResultDataYear> addYear(){
        List<ResultDataYear> list = QueryHiveUtils.getResultDataYear();
        for (int i = 0; i < list.size(); i++) {
            resultDataYearService.save(list.get(i));
        }
        return list;
    }

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 12:03
     * 描述:获得数据库之前分析好的数据  省份
     * @param []
     * @return java.util.List<com.mryao.bigdata.entity.ResultDataYear>
     */
    @ApiOperation("之前分析好的数据-省份")
    @GetMapping("/Province")
    private List<ResultDataProvince> listProvince(){
        return  resultDataProvinceService.findAll();
    }

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 12:04
     * 描述: 通过hive分析 得出结果 存入数据库 并返回
     * @param []
     * @return java.util.List<com.mryao.bigdata.entity.ResultDataYear>
     */
    @ApiOperation("通过hive分析-省份")
    @GetMapping("/Province/add")
    private List<ResultDataProvince> addProvince(){
        List<ResultDataProvince> list = QueryHiveUtils.getResultDataProvince();
        for (int i = 0; i < list.size(); i++) {
            resultDataProvinceService.save(list.get(i));
        }
        return list;
    }





}
