package com.cqut.atao.farm.order.domain.service.event;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName CreateOrderEvent.java
 * @Description 创建订单事件
 * @createTime 2023年02月17日 22:23:00
 */
public class CreateParentOrderEvent extends OrderEvent {


    public CreateParentOrderEvent(Object source, Object data) {
        super(source, data);
    }

    public CreateParentOrderEvent(Object source) {
        super(source);
    }
}
