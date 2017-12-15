package com.mryao.bigdata.controller;

import com.mryao.bigdata.entity.WormConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 19:57
 * @Description: 爬虫 （王健林）
 * @Version: 1.0
 */
@Api("网络爬虫api")
@RestController
@RequestMapping("/worm")
public class WormController {

    @ApiOperation("提交网络爬虫的配置并开始爬虫")
    @PostMapping("")
    public void startWorm(@RequestBody WormConfig wormConfig){
        //1、配置网络爬虫
        //2、调用网络爬虫（需不需要多线程同时进行？）
        //3、需不需要给一个完成的消息
    }
}
