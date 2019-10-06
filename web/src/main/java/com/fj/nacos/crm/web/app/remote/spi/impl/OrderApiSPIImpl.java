package com.fj.nacos.crm.web.app.remote.spi.impl;

import com.fj.nacos.crm.web.app.remote.spi.OrderApiSPI;
import com.fj.nacos.order.api.OrderApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class OrderApiSPIImpl implements OrderApiSPI {

    @Reference
    private OrderApi orderApi;

    @Override
    public String getOrderNo() {
        return orderApi.getOrderNo();
    }
}
