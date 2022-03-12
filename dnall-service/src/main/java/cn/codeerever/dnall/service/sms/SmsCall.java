package cn.codeerever.dnall.service.sms;

import lombok.Data;

import java.util.List;

@Data
public class SmsCall {
    private List<String> phones;
    private String content;
    private String customId;
}
