package com.funtl.itoken.service.digiccy.service.impl;

import com.funtl.itoken.common.domain.TbDigiccyExchangeMkt;
import com.funtl.itoken.common.mapper.TbDigiccyExchangeMktMapper;
import com.funtl.itoken.common.service.impl.BaseServiceImpl;
import com.funtl.itoken.service.digiccy.service.DigiccyExchangeMktService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DigiccyExchangeMktServiceImpl extends BaseServiceImpl<TbDigiccyExchangeMkt, TbDigiccyExchangeMktMapper> implements DigiccyExchangeMktService {
}
