package com.bporcv.cloud.consumer.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @time 2020/5/16-11:44
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private Long id;
    private String serial;

}
