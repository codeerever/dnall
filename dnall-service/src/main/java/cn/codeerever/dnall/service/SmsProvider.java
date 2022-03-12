package cn.codeerever.dnall.service;

import cn.codeerever.dnall.service.sms.SmsCall;
import cn.codeerever.dnall.service.sms.SmsCallOption;
import cn.codeerever.dnall.service.sms.SmsCallResult;

public interface SmsProvider {

    SmsCallResult send(SmsCall call, SmsCallOption option);

}
