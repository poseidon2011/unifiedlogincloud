package com.zuma.smssender.enums.error;

import com.zuma.smssender.enums.CodeEnum;
import lombok.Getter;

/**
 * author:ZhengXing
 * datetime:2017/11/27 0027 10:51
 * 筑望,deliver接口状态枚举
 */
@Getter
public enum ZhuWangDeliverStatEnum implements CodeEnum<String>{
    DELIVERED("DELIVRD","消息已送达"),
    EXPIRED("EXPIRED","消息过期"),
    DELETED("DELETED","消息已删除"),
    UNDELIVERABLE("UNDELIV","消息无法送达"),
    ACCEPTED("ACCEPTD","消息处于被接收状态"),
    UNKNOWN("UNKNOWN","消息无效"),
    REJECTED("REJECTD","消息被拒绝"),

    OTHEER("OTHER","其他(自定义)")


    ;
    private String code;
    private String message;

    ZhuWangDeliverStatEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
