package com.funtl.itoken.service.digiccy.controller;

import com.funtl.itoken.common.domain.TbDigiccyExchange;
import com.funtl.itoken.common.dto.BaseResult;
import com.funtl.itoken.common.utils.MapperUtils;
import com.funtl.itoken.service.digiccy.service.DigiccyExchangeService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "v1/digiccy/exchanges")
public class DigiccyExchangeController {

    @Autowired
    private DigiccyExchangeService digiccyExchangeService;

    /**
     * 保存
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseResult save(String tbDigiccyExchangeJson, String optsBy) {
        int result = 0;

        TbDigiccyExchange tbDigiccyExchange = null;
        try {
            tbDigiccyExchange = MapperUtils.json2pojo(tbDigiccyExchangeJson, TbDigiccyExchange.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (tbDigiccyExchange != null) {
            if (StringUtils.isBlank(tbDigiccyExchange.getExchGuid())) {
                tbDigiccyExchange.setExchGuid(UUID.randomUUID().toString());
                result = digiccyExchangeService.insert(tbDigiccyExchange, optsBy);
            } else {
                digiccyExchangeService.update(tbDigiccyExchange, optsBy);
            }

            // 最少有一行数据受影响
            if (result > 0) {
                return BaseResult.ok("保存交易所成功");
            }
        }

        return BaseResult.ok("保存交易所失败");
    }

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @param tbDigiccyExchangeJson
     * @return
     */
    @ApiOperation(value = "交易所列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "pageSize", value = "笔数", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "tbDigiccyExchangeJson", value = "对象 JSON 格式", required = false, dataTypeClass = String.class, paramType = "json")
    })
    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false) String tbDigiccyExchangeJson
    ) throws Exception {

        TbDigiccyExchange tbDigiccyExchange = null;
        if (StringUtils.isNotBlank(tbDigiccyExchangeJson)) {
            tbDigiccyExchange = MapperUtils.json2pojo(tbDigiccyExchangeJson, TbDigiccyExchange.class);
        }

        PageInfo pageInfo = digiccyExchangeService.page(pageNum, pageSize, tbDigiccyExchange);

        // 分页后的结果集
        List<TbDigiccyExchange> list = pageInfo.getList();

        // 封装 Cursor 对象
        BaseResult.Cursor cursor = new BaseResult.Cursor();
        cursor.setTotal(new Long(pageInfo.getTotal()).intValue());
        cursor.setOffset(pageInfo.getPageNum());
        cursor.setLimit(pageInfo.getPageSize());

        return BaseResult.ok(list, cursor);
    }
}
