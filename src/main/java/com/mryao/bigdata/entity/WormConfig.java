package com.mryao.bigdata.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 19:59
 * @Description: 网络爬虫的配置(需不需要存到数据库？)
 * @Version: 1.0
 */
@Entity
@Table(name ="T_RORM_CONFIG")
public class WormConfig {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    //目标网址
    private String targetURL;

    //后面补充

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTargetURL() {
        return targetURL;
    }

    public void setTargetURL(String targetURL) {
        this.targetURL = targetURL;
    }
}
