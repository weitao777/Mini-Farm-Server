package com.cqut.atao.farm.message.infrastructure.respository;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.cqut.atao.farm.message.domain.email.model.req.MailMessageSendReq;
import com.cqut.atao.farm.message.domain.email.model.vo.MailTemplateVO;
import com.cqut.atao.farm.message.domain.email.repository.MailTemplateRepository;
import com.cqut.atao.farm.message.infrastructure.converter.MailTemplateConverter;
import com.cqut.atao.farm.message.infrastructure.dao.MailTemplateDAO;
import com.cqut.atao.farm.message.infrastructure.po.MailTemplatePO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName MailTemplateRepositoryImp.java
 * @Description 邮件模版仓储类
 * @createTime 2023年01月11日 22:14:00
 */
@Repository
@AllArgsConstructor
public class MailTemplateRepositoryImp implements MailTemplateRepository {

    private final MailTemplateConverter mailTemplateConverter;

    private final MailTemplateDAO mailTemplateDAO;

    @Override
    public List<MailTemplateVO> selectList(MailMessageSendReq req) {
        List<MailTemplatePO> mailTemplatePOS = mailTemplateDAO.selectList(Wrappers.lambdaQuery(MailTemplatePO.class).eq(MailTemplatePO::getTemplateId, req.getTemplateId()));
        List<MailTemplateVO> mailTemplateVOS = Collections.emptyList();
        for (MailTemplatePO mailTemplatePO: mailTemplatePOS) {
            mailTemplateVOS.add(mailTemplateConverter.mailPOToVO(mailTemplatePO));
        }
        return mailTemplateVOS;
    }

    @Override
    public void saveMailMessage(MailMessageSendReq messageSend) {
        // todo 待定
    }
}
