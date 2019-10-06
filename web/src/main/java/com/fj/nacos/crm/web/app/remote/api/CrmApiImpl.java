package com.fj.nacos.crm.web.app.remote.api;

import com.fj.nacos.crm.api.CrmApi;
import org.apache.dubbo.config.annotation.Service;

import java.util.UUID;

@Service
public class CrmApiImpl implements CrmApi {
    @Override
    public String getCrmPerson(String name) {
        return UUID.randomUUID().toString() + ", " + name;
    }
}
