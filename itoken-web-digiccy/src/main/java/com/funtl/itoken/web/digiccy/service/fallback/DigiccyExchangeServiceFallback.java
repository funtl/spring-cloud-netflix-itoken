package com.funtl.itoken.web.digiccy.service.fallback;

import com.funtl.itoken.common.hystrix.Fallback;
import com.funtl.itoken.web.digiccy.service.DigiccyExchangeService;
import org.springframework.stereotype.Component;

@Component
public class DigiccyExchangeServiceFallback implements DigiccyExchangeService {
    @Override
    public String page(int pageNum, int pageSize, String tbDigiccyExchangeJson) {
        return Fallback.badGateway();
    }
}
