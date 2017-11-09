package com.zuma.smssender.strategy;

import com.zuma.smssender.config.SmsAccountCollection;
import com.zuma.smssender.dto.ErrorData;
import com.zuma.smssender.dto.ResultDTO;
import com.zuma.smssender.enums.PhoneOperatorEnum;
import com.zuma.smssender.enums.SmssAndPhonesRelationEnum;
import com.zuma.smssender.form.SendSmsForm;
import com.zuma.smssender.util.HttpClientUtil;

/**
 * author:Administrator
 * datetime:2017/11/8 0008 09:25
 * 发送短信参数策略模式 接口
 */
public interface SendSmsStrategy {
    //帐号s
    SmsAccountCollection ACCOUNTS = SmsAccountCollection.getInstance();
    //httpclient工具类
    HttpClientUtil HTTP_CLIENT_UTIL = HttpClientUtil.getInstance();

    /**
     * 发送短信，根据实体和　手机号数组包含的所有不同运营商数组 和  短信消息-手机号对应关系
     *
     * @param sendSmsForm               api收到的消息
     * @param containOperators          手机号数组包含的所有不同的运营商
     * @param smssAndPhonesRelationEnum 短信消息-手机号 关系，例如1-1；1-*；*-*
     * @return 返回对象
     */
     ResultDTO<?> sendSms(SendSmsForm sendSmsForm, PhoneOperatorEnum[] containOperators, SmssAndPhonesRelationEnum smssAndPhonesRelationEnum);
}