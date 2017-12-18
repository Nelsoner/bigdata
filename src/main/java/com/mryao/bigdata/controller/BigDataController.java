package com.mryao.bigdata.controller;

import com.mryao.bigdata.utils.JavaShellUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 20:06
 * @Description: 大数据平台api （蒋鹏）
 * @Version: 1.0
 */
@Api("大数据平台api")
@RequestMapping("/big_data")
@RestController
public class BigDataController {

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 12:00
     * 描述:调用爬虫脚本
     * @param []
     * @return void
     */
    @ApiOperation("调用爬虫脚本")
    @GetMapping("/start01")
    public void startBigData01() throws IOException {
        JavaShellUtil javaShellUtil = new JavaShellUtil();
        //参数为要执行的Shell命令，即通过调用Shell脚本sendKondorFile.sh将/temp目录下的tmp.pdf文件发送到192.168.1.200上
        int success = javaShellUtil.executeShell("sh /test/a.sh");
    }
}
