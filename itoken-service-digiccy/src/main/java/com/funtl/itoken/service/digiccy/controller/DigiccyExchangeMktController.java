package com.funtl.itoken.service.digiccy.controller;

import com.funtl.itoken.service.digiccy.service.DigiccyExchangeMktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/digiccy/exchange/mkts")
public class DigiccyExchangeMktController {

    @Autowired
    private DigiccyExchangeMktService digiccyExchangeMktService;
}
