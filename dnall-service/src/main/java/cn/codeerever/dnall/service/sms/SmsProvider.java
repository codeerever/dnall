package cn.codeerever.dnall.service.sms;

public interface SmsProvider {

    default String name() {
        return this.getClass().getSimpleName();
    }

    SmsCallResult send(SmsCall call, SmsCallOption option);

}
