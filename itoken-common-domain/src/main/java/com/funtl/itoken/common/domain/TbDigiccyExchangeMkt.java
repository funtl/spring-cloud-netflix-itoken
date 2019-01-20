package com.funtl.itoken.common.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "tb_digiccy_exchange_mkt")
public class TbDigiccyExchangeMkt extends BaseDomain {
    private static final long serialVersionUID = 5395576377500337565L;
    /**
     * 交易所名称
     */
    @Id
    @Column(name = "exch_name")
    private String exchName;

    /**
     * 交易所代号
     */
    @Column(name = "exch_code")
    private String exchCode;

    /**
     * 货币交易对代号
     */
    private String market;

    /**
     * 主货币显示名称
     */
    @Column(name = "market_name")
    private String marketName;

    /**
     * 涨跌幅，保留小数点后3位
     */
    private String degree;

    /**
     * 开盘价（早8:00）单位美元
     */
    @Column(name = "open_price")
    private String openPrice;

    /**
     * 最新价，单位美元
     */
    @Column(name = "last_price")
    private String lastPrice;

    /**
     * 最高价，单位美元
     */
    @Column(name = "high_price")
    private String highPrice;

    /**
     * 最低价，单位美元
     */
    @Column(name = "low_price")
    private String lowPrice;

    /**
     * 开盘价（早8:00）单位人民币（元）
     */
    @Column(name = "open_price_cny")
    private String openPriceCny;

    /**
     * 最新价，单位人民币（元）
     */
    @Column(name = "last_price_cny")
    private String lastPriceCny;

    /**
     * 最高价，单位人民币（元）
     */
    @Column(name = "high_price_cny")
    private String highPriceCny;

    /**
     * 最低价，单位人民币（元）
     */
    @Column(name = "low_price_cny")
    private String lowPriceCny;

    /**
     * 当前成交货币量，单位（个）
     */
    @Column(name = "current_vol")
    private String currentVol;

    /**
     * 数据更新时间戳，秒级，东八区时间
     */
    @Column(name = "time_updated")
    private String timeUpdated;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 扩展 String 1
     */
    @Column(name = "extend_s1")
    private String extendS1;

    /**
     * 扩展 String 2
     */
    @Column(name = "extend_s2")
    private String extendS2;

    /**
     * 扩展 String 3
     */
    @Column(name = "extend_s3")
    private String extendS3;

    /**
     * 扩展 String 4
     */
    @Column(name = "extend_s4")
    private String extendS4;

    /**
     * 扩展 String 5
     */
    @Column(name = "extend_s5")
    private String extendS5;

    /**
     * 扩展 String 6
     */
    @Column(name = "extend_s6")
    private String extendS6;

    /**
     * 扩展 String 7
     */
    @Column(name = "extend_s7")
    private String extendS7;

    /**
     * 扩展 String 8
     */
    @Column(name = "extend_s8")
    private String extendS8;

    /**
     * 扩展 Integer 1
     */
    @Column(name = "extend_i1")
    private BigDecimal extendI1;

    /**
     * 扩展 Integer 2
     */
    @Column(name = "extend_i2")
    private BigDecimal extendI2;

    /**
     * 扩展 Integer 3
     */
    @Column(name = "extend_i3")
    private BigDecimal extendI3;

    /**
     * 扩展 Integer 4
     */
    @Column(name = "extend_i4")
    private BigDecimal extendI4;

    /**
     * 扩展 Float 1
     */
    @Column(name = "extend_f1")
    private BigDecimal extendF1;

    /**
     * 扩展 Float 2
     */
    @Column(name = "extend_f2")
    private BigDecimal extendF2;

    /**
     * 扩展 Float 3
     */
    @Column(name = "extend_f3")
    private BigDecimal extendF3;

    /**
     * 扩展 Float 4
     */
    @Column(name = "extend_f4")
    private BigDecimal extendF4;

    /**
     * 扩展 Date 1
     */
    @Column(name = "extend_d1")
    private Date extendD1;

    /**
     * 扩展 Date 2
     */
    @Column(name = "extend_d2")
    private Date extendD2;

    /**
     * 扩展 Date 3
     */
    @Column(name = "extend_d3")
    private Date extendD3;

    /**
     * 扩展 Date 4
     */
    @Column(name = "extend_d4")
    private Date extendD4;

    /**
     * 获取交易所名称
     *
     * @return exch_name - 交易所名称
     */
    public String getExchName() {
        return exchName;
    }

    /**
     * 设置交易所名称
     *
     * @param exchName 交易所名称
     */
    public void setExchName(String exchName) {
        this.exchName = exchName;
    }

    /**
     * 获取交易所代号
     *
     * @return exch_code - 交易所代号
     */
    public String getExchCode() {
        return exchCode;
    }

    /**
     * 设置交易所代号
     *
     * @param exchCode 交易所代号
     */
    public void setExchCode(String exchCode) {
        this.exchCode = exchCode;
    }

    /**
     * 获取货币交易对代号
     *
     * @return market - 货币交易对代号
     */
    public String getMarket() {
        return market;
    }

    /**
     * 设置货币交易对代号
     *
     * @param market 货币交易对代号
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * 获取主货币显示名称
     *
     * @return market_name - 主货币显示名称
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * 设置主货币显示名称
     *
     * @param marketName 主货币显示名称
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    /**
     * 获取涨跌幅，保留小数点后3位
     *
     * @return degree - 涨跌幅，保留小数点后3位
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置涨跌幅，保留小数点后3位
     *
     * @param degree 涨跌幅，保留小数点后3位
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 获取开盘价（早8:00）单位美元
     *
     * @return open_price - 开盘价（早8:00）单位美元
     */
    public String getOpenPrice() {
        return openPrice;
    }

    /**
     * 设置开盘价（早8:00）单位美元
     *
     * @param openPrice 开盘价（早8:00）单位美元
     */
    public void setOpenPrice(String openPrice) {
        this.openPrice = openPrice;
    }

    /**
     * 获取最新价，单位美元
     *
     * @return last_price - 最新价，单位美元
     */
    public String getLastPrice() {
        return lastPrice;
    }

    /**
     * 设置最新价，单位美元
     *
     * @param lastPrice 最新价，单位美元
     */
    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    /**
     * 获取最高价，单位美元
     *
     * @return high_price - 最高价，单位美元
     */
    public String getHighPrice() {
        return highPrice;
    }

    /**
     * 设置最高价，单位美元
     *
     * @param highPrice 最高价，单位美元
     */
    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    /**
     * 获取最低价，单位美元
     *
     * @return low_price - 最低价，单位美元
     */
    public String getLowPrice() {
        return lowPrice;
    }

    /**
     * 设置最低价，单位美元
     *
     * @param lowPrice 最低价，单位美元
     */
    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    /**
     * 获取开盘价（早8:00）单位人民币（元）
     *
     * @return open_price_cny - 开盘价（早8:00）单位人民币（元）
     */
    public String getOpenPriceCny() {
        return openPriceCny;
    }

    /**
     * 设置开盘价（早8:00）单位人民币（元）
     *
     * @param openPriceCny 开盘价（早8:00）单位人民币（元）
     */
    public void setOpenPriceCny(String openPriceCny) {
        this.openPriceCny = openPriceCny;
    }

    /**
     * 获取最新价，单位人民币（元）
     *
     * @return last_price_cny - 最新价，单位人民币（元）
     */
    public String getLastPriceCny() {
        return lastPriceCny;
    }

    /**
     * 设置最新价，单位人民币（元）
     *
     * @param lastPriceCny 最新价，单位人民币（元）
     */
    public void setLastPriceCny(String lastPriceCny) {
        this.lastPriceCny = lastPriceCny;
    }

    /**
     * 获取最高价，单位人民币（元）
     *
     * @return high_price_cny - 最高价，单位人民币（元）
     */
    public String getHighPriceCny() {
        return highPriceCny;
    }

    /**
     * 设置最高价，单位人民币（元）
     *
     * @param highPriceCny 最高价，单位人民币（元）
     */
    public void setHighPriceCny(String highPriceCny) {
        this.highPriceCny = highPriceCny;
    }

    /**
     * 获取最低价，单位人民币（元）
     *
     * @return low_price_cny - 最低价，单位人民币（元）
     */
    public String getLowPriceCny() {
        return lowPriceCny;
    }

    /**
     * 设置最低价，单位人民币（元）
     *
     * @param lowPriceCny 最低价，单位人民币（元）
     */
    public void setLowPriceCny(String lowPriceCny) {
        this.lowPriceCny = lowPriceCny;
    }

    /**
     * 获取当前成交货币量，单位（个）
     *
     * @return current_vol - 当前成交货币量，单位（个）
     */
    public String getCurrentVol() {
        return currentVol;
    }

    /**
     * 设置当前成交货币量，单位（个）
     *
     * @param currentVol 当前成交货币量，单位（个）
     */
    public void setCurrentVol(String currentVol) {
        this.currentVol = currentVol;
    }

    /**
     * 获取数据更新时间戳，秒级，东八区时间
     *
     * @return time_updated - 数据更新时间戳，秒级，东八区时间
     */
    public String getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * 设置数据更新时间戳，秒级，东八区时间
     *
     * @param timeUpdated 数据更新时间戳，秒级，东八区时间
     */
    public void setTimeUpdated(String timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    /**
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新者
     *
     * @return update_by - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取扩展 String 1
     *
     * @return extend_s1 - 扩展 String 1
     */
    public String getExtendS1() {
        return extendS1;
    }

    /**
     * 设置扩展 String 1
     *
     * @param extendS1 扩展 String 1
     */
    public void setExtendS1(String extendS1) {
        this.extendS1 = extendS1;
    }

    /**
     * 获取扩展 String 2
     *
     * @return extend_s2 - 扩展 String 2
     */
    public String getExtendS2() {
        return extendS2;
    }

    /**
     * 设置扩展 String 2
     *
     * @param extendS2 扩展 String 2
     */
    public void setExtendS2(String extendS2) {
        this.extendS2 = extendS2;
    }

    /**
     * 获取扩展 String 3
     *
     * @return extend_s3 - 扩展 String 3
     */
    public String getExtendS3() {
        return extendS3;
    }

    /**
     * 设置扩展 String 3
     *
     * @param extendS3 扩展 String 3
     */
    public void setExtendS3(String extendS3) {
        this.extendS3 = extendS3;
    }

    /**
     * 获取扩展 String 4
     *
     * @return extend_s4 - 扩展 String 4
     */
    public String getExtendS4() {
        return extendS4;
    }

    /**
     * 设置扩展 String 4
     *
     * @param extendS4 扩展 String 4
     */
    public void setExtendS4(String extendS4) {
        this.extendS4 = extendS4;
    }

    /**
     * 获取扩展 String 5
     *
     * @return extend_s5 - 扩展 String 5
     */
    public String getExtendS5() {
        return extendS5;
    }

    /**
     * 设置扩展 String 5
     *
     * @param extendS5 扩展 String 5
     */
    public void setExtendS5(String extendS5) {
        this.extendS5 = extendS5;
    }

    /**
     * 获取扩展 String 6
     *
     * @return extend_s6 - 扩展 String 6
     */
    public String getExtendS6() {
        return extendS6;
    }

    /**
     * 设置扩展 String 6
     *
     * @param extendS6 扩展 String 6
     */
    public void setExtendS6(String extendS6) {
        this.extendS6 = extendS6;
    }

    /**
     * 获取扩展 String 7
     *
     * @return extend_s7 - 扩展 String 7
     */
    public String getExtendS7() {
        return extendS7;
    }

    /**
     * 设置扩展 String 7
     *
     * @param extendS7 扩展 String 7
     */
    public void setExtendS7(String extendS7) {
        this.extendS7 = extendS7;
    }

    /**
     * 获取扩展 String 8
     *
     * @return extend_s8 - 扩展 String 8
     */
    public String getExtendS8() {
        return extendS8;
    }

    /**
     * 设置扩展 String 8
     *
     * @param extendS8 扩展 String 8
     */
    public void setExtendS8(String extendS8) {
        this.extendS8 = extendS8;
    }

    /**
     * 获取扩展 Integer 1
     *
     * @return extend_i1 - 扩展 Integer 1
     */
    public BigDecimal getExtendI1() {
        return extendI1;
    }

    /**
     * 设置扩展 Integer 1
     *
     * @param extendI1 扩展 Integer 1
     */
    public void setExtendI1(BigDecimal extendI1) {
        this.extendI1 = extendI1;
    }

    /**
     * 获取扩展 Integer 2
     *
     * @return extend_i2 - 扩展 Integer 2
     */
    public BigDecimal getExtendI2() {
        return extendI2;
    }

    /**
     * 设置扩展 Integer 2
     *
     * @param extendI2 扩展 Integer 2
     */
    public void setExtendI2(BigDecimal extendI2) {
        this.extendI2 = extendI2;
    }

    /**
     * 获取扩展 Integer 3
     *
     * @return extend_i3 - 扩展 Integer 3
     */
    public BigDecimal getExtendI3() {
        return extendI3;
    }

    /**
     * 设置扩展 Integer 3
     *
     * @param extendI3 扩展 Integer 3
     */
    public void setExtendI3(BigDecimal extendI3) {
        this.extendI3 = extendI3;
    }

    /**
     * 获取扩展 Integer 4
     *
     * @return extend_i4 - 扩展 Integer 4
     */
    public BigDecimal getExtendI4() {
        return extendI4;
    }

    /**
     * 设置扩展 Integer 4
     *
     * @param extendI4 扩展 Integer 4
     */
    public void setExtendI4(BigDecimal extendI4) {
        this.extendI4 = extendI4;
    }

    /**
     * 获取扩展 Float 1
     *
     * @return extend_f1 - 扩展 Float 1
     */
    public BigDecimal getExtendF1() {
        return extendF1;
    }

    /**
     * 设置扩展 Float 1
     *
     * @param extendF1 扩展 Float 1
     */
    public void setExtendF1(BigDecimal extendF1) {
        this.extendF1 = extendF1;
    }

    /**
     * 获取扩展 Float 2
     *
     * @return extend_f2 - 扩展 Float 2
     */
    public BigDecimal getExtendF2() {
        return extendF2;
    }

    /**
     * 设置扩展 Float 2
     *
     * @param extendF2 扩展 Float 2
     */
    public void setExtendF2(BigDecimal extendF2) {
        this.extendF2 = extendF2;
    }

    /**
     * 获取扩展 Float 3
     *
     * @return extend_f3 - 扩展 Float 3
     */
    public BigDecimal getExtendF3() {
        return extendF3;
    }

    /**
     * 设置扩展 Float 3
     *
     * @param extendF3 扩展 Float 3
     */
    public void setExtendF3(BigDecimal extendF3) {
        this.extendF3 = extendF3;
    }

    /**
     * 获取扩展 Float 4
     *
     * @return extend_f4 - 扩展 Float 4
     */
    public BigDecimal getExtendF4() {
        return extendF4;
    }

    /**
     * 设置扩展 Float 4
     *
     * @param extendF4 扩展 Float 4
     */
    public void setExtendF4(BigDecimal extendF4) {
        this.extendF4 = extendF4;
    }

    /**
     * 获取扩展 Date 1
     *
     * @return extend_d1 - 扩展 Date 1
     */
    public Date getExtendD1() {
        return extendD1;
    }

    /**
     * 设置扩展 Date 1
     *
     * @param extendD1 扩展 Date 1
     */
    public void setExtendD1(Date extendD1) {
        this.extendD1 = extendD1;
    }

    /**
     * 获取扩展 Date 2
     *
     * @return extend_d2 - 扩展 Date 2
     */
    public Date getExtendD2() {
        return extendD2;
    }

    /**
     * 设置扩展 Date 2
     *
     * @param extendD2 扩展 Date 2
     */
    public void setExtendD2(Date extendD2) {
        this.extendD2 = extendD2;
    }

    /**
     * 获取扩展 Date 3
     *
     * @return extend_d3 - 扩展 Date 3
     */
    public Date getExtendD3() {
        return extendD3;
    }

    /**
     * 设置扩展 Date 3
     *
     * @param extendD3 扩展 Date 3
     */
    public void setExtendD3(Date extendD3) {
        this.extendD3 = extendD3;
    }

    /**
     * 获取扩展 Date 4
     *
     * @return extend_d4 - 扩展 Date 4
     */
    public Date getExtendD4() {
        return extendD4;
    }

    /**
     * 设置扩展 Date 4
     *
     * @param extendD4 扩展 Date 4
     */
    public void setExtendD4(Date extendD4) {
        this.extendD4 = extendD4;
    }
}