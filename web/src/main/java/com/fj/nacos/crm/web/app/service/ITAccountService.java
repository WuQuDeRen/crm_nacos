package com.fj.nacos.crm.web.app.service;

import com.baomidou.mybatisplus.service.IService;
import com.fj.nacos.common.dto.AccountDTO;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.crm.web.app.entity.TAccount;

/**
 * <p>
 *  服务类
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface ITAccountService extends IService<TAccount> {

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
