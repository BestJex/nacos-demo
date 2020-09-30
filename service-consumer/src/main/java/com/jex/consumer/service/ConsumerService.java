package com.jex.consumer.service;

import com.jex.consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient("service-provider")
public interface ConsumerService {

    @GetMapping("/user/list")

    List<User> list();

}
