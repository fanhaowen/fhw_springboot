package com.example.fhw_springboot.Entity;

import lombok.Data;

@Data
public class info {
    private Long id;
    private Long uid;
    private Integer cid;
    private String title;
    private String content;
    private String create_time;
}
