package com.rockfintech.reas.springboot.service;

import com.rockfintech.reas.springboot.entity.XaLog;
import com.rockfintech.reas.springboot.exception.BizException;

import java.util.Map;

public interface IXaLogService extends IBaseService<XaLog> {

    void notice(Map<String, Object> map) throws Exception;

    void insertParams(XaLog xaLog) throws BizException;

    void add(XaLog xaLog) throws BizException;
}
