package com.fj.nacos.crm.web.app.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.fj.nacos.crm.web.app.entity.TAccount;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface TAccountMapper extends BaseMapper<TAccount> {

    int decreaseAccount(@Param("userId") String userId, @Param("amount") Double amount);
}
