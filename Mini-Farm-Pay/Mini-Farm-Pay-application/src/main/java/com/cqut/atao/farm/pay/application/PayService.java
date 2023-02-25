package com.cqut.atao.farm.pay.application;

import com.cqut.atao.farm.pay.domain.acquiresystem.model.req.PayReq;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName PayService.java
 * @Description 支付服务接口
 * @createTime 2023年02月24日 17:44:00
 */
public interface PayService {


    /**
     * 付款验签
     * @param req 支付请求
     * @return 验签结果
     */
    Object payMoneySign(PayReq req);


    /**
     * 付款结果
     * @param req 支付请求
     * @return 支付结果
     */
    Object payMoneyResult(PayReq req);

}
