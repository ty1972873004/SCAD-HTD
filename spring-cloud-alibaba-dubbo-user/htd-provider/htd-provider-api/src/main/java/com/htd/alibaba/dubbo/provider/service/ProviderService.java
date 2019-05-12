package com.htd.alibaba.dubbo.provider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 接口
 *
 * @author YangBo
 * @date 2019/05/12
 */
@FeignClient("provider")
public interface ProviderService {
    @GetMapping("/hi")
    String hi();
}