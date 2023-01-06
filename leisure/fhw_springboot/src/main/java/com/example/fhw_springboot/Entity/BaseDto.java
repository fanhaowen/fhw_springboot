package com.example.fhw_springboot.Entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class BaseDto implements Serializable {

    private static final long serialVersionUID = -3404115733111557203L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
