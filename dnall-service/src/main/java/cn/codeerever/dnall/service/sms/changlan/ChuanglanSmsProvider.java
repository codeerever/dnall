package cn.codeerever.dnall.service.sms.changlan;

import cn.codeerever.dnall.service.SmsProvider;
import cn.codeerever.dnall.service.sms.*;

public class ChuanglanSmsProvider implements SmsProvider {

    private final String username;
    private final String password;

    public ChuanglanSmsProvider(String username, String password) {
        this.password = password;
        this.username = username;
    }

    @Override
    public SmsCallResult send(SmsCall call, SmsCallOption option) {
        return null;
    }

}
