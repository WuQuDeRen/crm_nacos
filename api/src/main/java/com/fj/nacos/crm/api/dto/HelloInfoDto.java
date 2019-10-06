package com.fj.nacos.crm.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HelloInfoDto implements Serializable {

    private static final long serialVersionUID = -6006276928734320651L;

    private String name;
    private String content;

}
