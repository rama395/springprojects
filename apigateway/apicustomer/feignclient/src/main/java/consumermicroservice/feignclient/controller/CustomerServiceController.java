package consumermicroservice.feignclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
@Slf4j
public class CustomerServiceController
{
    @GetMapping("/report")
    public ResponseEntity<String> showMessage()
    {
        return new ResponseEntity<String>("From the Customer API:", HttpStatus.OK);
    }



}
