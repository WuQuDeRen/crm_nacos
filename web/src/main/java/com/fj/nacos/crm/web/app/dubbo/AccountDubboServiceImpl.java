package com.fj.nacos.crm.web.app.dubbo;

import com.fj.nacos.common.dto.AccountDTO;
import com.fj.nacos.common.dubbo.AccountDubboService;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.crm.web.app.service.ITAccountService;
import io.seata.core.context.RootContext;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: heshouyou
 * @Description  Dubbo Api Impl
 * @Date Created in 2019/1/23 14:40
 */
@Service
@Slf4j
public class AccountDubboServiceImpl implements AccountDubboService {

    @Autowired
    private ITAccountService accountService;

    @Override
    public ObjectResponse decreaseAccount(AccountDTO accountDTO) {
        log.info("全局事务id ：" + RootContext.getXID());
        return accountService.decreaseAccount(accountDTO);
    }
}
