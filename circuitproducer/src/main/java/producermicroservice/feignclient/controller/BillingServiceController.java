package producermicroservice.feignclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
@Slf4j
public class BillingServiceController
{
    @Value("${server.port}")
    private int port;
    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/info")
    public String getBillingInfo()
    {
        log.info("Billing service producer");
        return "we accept card payment,UPI payment,Net banking payment,COD";
    }


}
