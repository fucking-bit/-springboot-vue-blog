package com.huang.shiro;

import lombok.Data;

/**
 * 账户非私密信息
 */
@Data
public class AccountProfile {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}
