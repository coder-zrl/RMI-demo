package com.zrl.api.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Zhang Ruilong
 * @email 970586718@qq.com
 * @date 2021-08-16 0:15
 * @description
 */
@Data
public class User implements Serializable {
    Integer id;
    String username;
}
