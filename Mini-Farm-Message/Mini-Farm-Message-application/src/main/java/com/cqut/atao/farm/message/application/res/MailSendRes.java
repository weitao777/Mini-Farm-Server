package com.cqut.atao.farm.message.application.res;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName MessageSendRes.java
 * @Description 消息发送返回实体
 * @createTime 2023年01月11日 17:00:00
 */


@Data
@AllArgsConstructor
public class MailSendRes {

    /**
     * 消息发送ID
     */
    private String messageSendId;

}
