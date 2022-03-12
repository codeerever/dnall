package cn.codeerever.dnall.service.sms;

import lombok.Data;

@Data
public class SmsCallResult {
    /** 发送状态码*/
    private SmsCode code;
    /** 批次号*/
    private String seqId;
}
