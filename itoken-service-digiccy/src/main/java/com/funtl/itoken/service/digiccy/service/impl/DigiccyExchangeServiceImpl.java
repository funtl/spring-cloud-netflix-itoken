package com.funtl.itoken.service.digiccy.service.impl;

import com.funtl.itoken.common.domain.TbDigiccyExchange;
import com.funtl.itoken.common.service.impl.BaseServiceImpl;
import com.funtl.itoken.service.digiccy.mapper.TbDigiccyExchangeExtendMapper;
import com.funtl.itoken.service.digiccy.service.DigiccyExchangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DigiccyExchangeServiceImpl extends BaseServiceImpl<TbDigiccyExchange, TbDigiccyExchangeExtendMapper> implements DigiccyExchangeService {
}
