package com.fj.nacos.crm.web.app;

import com.fj.nacos.crm.web.app.remote.spi.OrderApiSPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrmController {


    @Autowired
    private OrderApiSPI orderApiSPI;

//    @GetMapping("/testHello")
//    public HelloInfoDto test(String name) {
//        HelloInfoDto hello = crmHelloApi.crmHello(name);
//        return hello;
//    }

    @GetMapping("/getOrderNo")
    public String getOrderNo() {
        return orderApiSPI.getOrderNo();
    }
}
