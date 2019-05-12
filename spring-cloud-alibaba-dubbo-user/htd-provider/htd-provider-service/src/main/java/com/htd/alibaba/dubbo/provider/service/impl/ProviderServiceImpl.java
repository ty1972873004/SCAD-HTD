package com.htd.alibaba.dubbo.provider.service.impl;

import com.htd.alibaba.dubbo.provider.service.ProviderService;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is Description
 *
 * @author YangBo
 * @date 2019/05/13
 */
@RestController
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String hi() {
        return "Hi Spring Cloud Alibaba Dubbo";
    }
}