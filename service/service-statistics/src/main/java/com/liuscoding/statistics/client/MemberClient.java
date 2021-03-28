package com.liuscoding.statistics.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 */
@FeignClient(value = "service-ucenter", fallback = MemberClientImpl.class)
@Component
public interface MemberClient {

    /**
     * 查询指定日期的注册人数
     *
     * @param day 指定日期
     * @return 注册人数
     */
    @GetMapping("/ucenter/member/countRegister/{day}")
    Integer countRegister(@PathVariable("day") String day);
}
