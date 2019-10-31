package com.ligq.study.mybatis.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SuperCsvModel {
    private String column;
    private int index;
    private Object value;
}
