package com.htd.alibaba.dubbo.provider.service.impl;

import com.htd.alibaba.dubbo.provider.service.FooService;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is Description
 *
 * @author YangBo
 * @date 2019/05/13
 */
@RestController
public class FooServiceImpl implements FooService {
    @Override
    public String foo() {
        return "Foo Spring Cloud Alibaba Dubbo";
    }
}