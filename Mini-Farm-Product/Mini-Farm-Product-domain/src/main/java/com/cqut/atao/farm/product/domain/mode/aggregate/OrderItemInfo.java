package com.cqut.atao.farm.product.domain.mode.aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName CartItemInfo.java
 * @Description 订单商品信息
 * @createTime 2023年02月19日 16:58:00
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemInfo {

    /**
     * 商品sku
     */
    private Long skuId;

    /**
     * 数量
     */
    private Integer num;

}
