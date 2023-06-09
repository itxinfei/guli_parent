package com.liuscoding.statistics.client;

import com.liuscoding.commonutils.result.ResultCode;
import com.liuscoding.servicebase.exceptionhandler.exception.GuiException;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class MemberClientImpl implements MemberClient {
    /**
     * 查询指定日期的注册人数
     *
     * @param day 指定日期
     * @return 注册人数
     */
    @Override
    public Integer countRegister(String day) {
        throw GuiException.from(ResultCode.REMOTE_CALL_MEMBER);
    }
}
