package com.mryao.bigdata.dao;

import com.mryao.bigdata.entity.RawData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/6 19:48
 * @Description:
 * @Version: 1.0
 */
public interface RawDataRepository extends JpaRepository<RawData, String> {
}
