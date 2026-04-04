package consumermicroservice.feignclient.controller;

import consumermicroservice.feignclient.BillingServiceRestConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Slf4j
public class ShoppingController
{
    @Autowired
    private BillingServiceRestConsumer billingServiceRestConsumer;

    @GetMapping("details")
    public String displayShoppingDetails()
    {
        log.info("shopping controller:client comp class name:{}",billingServiceRestConsumer.getClass());
        return "Ugadi shopping...."+billingServiceRestConsumer.fetchBillInfo();




    }

}
