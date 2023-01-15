package com.cqut.atao.user.infrastructure.respository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cqut.atao.farm.user.domain.model.vo.ReceiveAddressVO;
import com.cqut.atao.farm.user.domain.repository.IReceiveAddressRepository;
import com.cqut.atao.user.infrastructure.dao.ReceiveAddressDao;
import com.cqut.atao.user.infrastructure.po.ReceiveAddressPO;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ReceiveAddressRepository.java
 * @Description 收货地址仓储实现
 * @createTime 2023年01月13日 21:20:00
 */
public class ReceiveAddressRepository implements IReceiveAddressRepository {

    @Resource
    private ReceiveAddressDao receiveAddressDao;

    @Override
    public List<ReceiveAddressVO> queryList(String userId) {
        // todo
        return null;
//        return receiveAddressDao.selectList(new QueryWrapper<ReceiveAddressPO>().lambda().eq(ReceiveAddressPO::getCustomerUserId,userId));
    }
}