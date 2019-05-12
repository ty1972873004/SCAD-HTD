package com.htd.alibaba.dubbo.consumer.service;

import com.htd.alibaba.dubbo.provider.service.FooService;
import com.htd.alibaba.dubbo.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is Description
 *
 * @author YangBo
 * @date 2019/05/13
 */
@RestController
public class TestService {

    @Autowired
    private ProviderService providerService;

    @Autowired
    private FooService fooService;

    @GetMapping("/test")
    public String test() {
        return providerService.hi();
    }

    @GetMapping("/test/foo")
    public String testFoo() {
        return fooService.foo();
    }
}
