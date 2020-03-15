package com.darks.feign;

import com.darks.entity.Student;
import com.darks.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value="provider",fallback = FeignError.class)  //接口访问的是哪个服务 注册中心的名字
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
