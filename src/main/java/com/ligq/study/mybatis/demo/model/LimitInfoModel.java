package com.ligq.study.mybatis.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimitInfoModel {
    private String customerId;
    private long limitAmt;
}
