package producermicroservice.feignclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
@Slf4j
public class EmployeeServiceController
{
    @GetMapping("/report")
    public ResponseEntity<String> showMessage()
    {
        return new ResponseEntity<String>("From the Employee API:", HttpStatus.OK);
    }



}
