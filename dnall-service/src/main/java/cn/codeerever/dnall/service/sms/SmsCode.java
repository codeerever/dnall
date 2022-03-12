package cn.codeerever.dnall.service.sms;

public enum SmsCode {
    SUCCESS(10001, "发送成功");

    final int code;
    final String msg;

    SmsCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
