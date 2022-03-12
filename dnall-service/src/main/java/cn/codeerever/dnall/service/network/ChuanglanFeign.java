package cn.codeerever.dnall.service.network;

import cn.codeerever.dnall.service.network.domain.ChuanglanSmsRequest;
import cn.codeerever.dnall.service.network.domain.ChuanglanSmsResponse;
import cn.codeerever.dnall.service.network.fallback.ChuanglanFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "chuanglan-sms", url = "${chuanglan.url}", fallbackFactory = ChuanglanFallbackFactory.class)
public interface ChuanglanFeign {

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "/send"
    )
    ChuanglanSmsResponse sendSms(@RequestBody ChuanglanSmsRequest request);

}
