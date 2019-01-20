package com.funtl.itoken.common.mapper;

import com.funtl.itoken.common.domain.TbDigiccyExchange;
import com.funtl.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbDigiccyExchangeMapper extends MyMapper<TbDigiccyExchange> {
}