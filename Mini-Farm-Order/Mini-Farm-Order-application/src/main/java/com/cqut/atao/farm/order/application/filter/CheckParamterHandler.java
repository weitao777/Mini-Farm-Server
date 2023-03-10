package com.cqut.atao.farm.order.application.filter;

import com.cqut.atao.farm.order.application.filter.check.CheckNullParmter;
import com.cqut.atao.farm.order.domain.model.aggregate.Order;
import com.cqut.atao.farm.order.domain.model.req.PlaceOrderReq;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName CheckParamterHander.java
 * @Description 参数校验器
 * @createTime 2023年02月26日 20:22:00
 */
@Component
public class CheckParamterHandler {

    private CheckParamterAbstract check;

    @Resource
    private CheckNullParmter checkNullParmter;

    public boolean doCheck(PlaceOrderReq req) {
        return this.check.doCheck(req);
    }

    @PostConstruct
    public void InitFilter() {
        this.check = checkNullParmter;
    }


}
