package com.cqut.atao.farm.pay.web.controller;

import com.cqut.atao.farm.pay.application.PayService;
import com.cqut.atao.farm.pay.domain.acquiresystem.model.req.PayReq;
import com.cqut.atao.farm.springboot.starter.convention.result.Result;
import com.cqut.atao.farm.springboot.starter.log.annotation.MiniLog;
import com.cqut.atao.farm.springboot.starter.web.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName PayController.java
 * @Description 支付控制器
 * @createTime 2023年02月22日 09:30:00
 */
@Api
@MiniLog
@RestController
@RequestMapping("/api/pay")
public class PayController {

    @Resource
    private PayService payService;

    @PostMapping("/pay/order")
    @ApiOperation("付款订单")
    public Result<Object> payMoney(@RequestBody PayReq req){
        Object o = payService.payMoneySign(req);
        return Results.success(o);
    }

    @RequestMapping("/pay/notify")
    @ApiOperation("三方支付后回调通知（支付成功还是失败）")
    public Result<Object> notifyPayResult(@RequestBody PayReq payReq){
        Object o = payService.payMoneyResult(payReq);
        return Results.success(o);
    }

    @PostMapping("/refund")
    public Result<Void> refundMoney(){
        return null;
    }

    @PostMapping("/remit")
    public Result<Void> remitMoney(){
        return null;
    }

}
