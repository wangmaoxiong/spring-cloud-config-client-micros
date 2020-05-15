package com.wmx.springcloudconfigclientmicros;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangmaoxiong
 * @version 1.0
 * @date 2020/5/15 20:01
 */
@RestController
public class HelloWorldController {

    /**
     * 获取配置文件中的属性值.
     * 远程配置的优先级高于本地配置.
     */
    @Value("${feign.server.pt}")
    private String feignServerPt;

    /**
     * http://localhost:8085/hello/getConfig
     *
     * @return
     */
    @GetMapping("/hello/getConfig")
    public String getConfig() {
        return feignServerPt;
    }
}
