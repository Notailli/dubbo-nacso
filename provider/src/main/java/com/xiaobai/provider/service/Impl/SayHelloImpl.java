package com.xiaobai.provider.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaobai.api.service.SayHelloService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0",group = "dev")
public class SayHelloImpl implements SayHelloService {
    @Override
    public String sayHello(String name){
        System.out.println("----------------Hello " + name);
        return "Hello " + name;
    }
}
