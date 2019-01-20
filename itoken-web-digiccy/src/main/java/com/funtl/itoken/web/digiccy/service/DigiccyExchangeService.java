package com.funtl.itoken.web.digiccy.service;

import com.funtl.itoken.common.web.service.BaseClientService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "itoken-service-digiccy")
public interface DigiccyExchangeService extends BaseClientService {

    @RequestMapping(value = "v1/digiccy/exchanges/page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public String page(
            @PathVariable(required = true, value = "pageNum") int pageNum,
            @PathVariable(required = true, value = "pageSize") int pageSize,
            @RequestParam(required = false, value = "tbDigiccyExchangeJson") String tbDigiccyExchangeJson
    );

}
