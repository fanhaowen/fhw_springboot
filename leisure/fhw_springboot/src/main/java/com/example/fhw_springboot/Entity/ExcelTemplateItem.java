package com.example.fhw_springboot.Entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class ExcelTemplateItem implements Serializable {
    @ExcelProperty(value = "id", index = 0)
    private Long popId;
    @ExcelProperty(value = "type", index = 10)
    private String popTypeDesc;
    @ExcelProperty(value = "business_model", index = 38)
    private Integer businessModel;
    @ExcelProperty(value = "cooperativeMode", index = 48)
    private Integer cooperativeMode;

    private Integer popType;
}
