package com.suxing.service;

import com.suxing.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author vaingloryss
 * @date 2019/11/1 0001 下午 3:06
 */
@Service
public interface UserService {
    User queryUserByUsername(String username);

    void register();

}
