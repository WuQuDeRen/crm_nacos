package com.fj.nacos.crm.web.app.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.fj.nacos.common.dto.AccountDTO;
import com.fj.nacos.common.enums.RspStatusEnum;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.crm.web.app.entity.TAccount;
import com.fj.nacos.crm.web.app.mapper.TAccountMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
@Service
public class TAccountServiceImpl extends ServiceImpl<TAccountMapper, TAccount> implements ITAccountService {

    @Override
    public ObjectResponse decreaseAccount(AccountDTO accountDTO) {
        int account = baseMapper.decreaseAccount(accountDTO.getUserId(), accountDTO.getAmount().doubleValue());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (account > 0){
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }
}
