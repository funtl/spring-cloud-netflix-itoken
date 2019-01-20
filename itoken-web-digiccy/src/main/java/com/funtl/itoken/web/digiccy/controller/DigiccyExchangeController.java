package com.funtl.itoken.web.digiccy.controller;

import com.funtl.itoken.common.domain.TbDigiccyExchange;
import com.funtl.itoken.common.web.controller.BaseController;
import com.funtl.itoken.web.digiccy.service.DigiccyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "exchange")
public class DigiccyExchangeController extends BaseController<TbDigiccyExchange, DigiccyExchangeService> {

    @Autowired
    private DigiccyExchangeService digiccyExchangeService;

    /**
     * 跳转列表页
     *
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String index() {
        return "exchange_list";
    }
}
