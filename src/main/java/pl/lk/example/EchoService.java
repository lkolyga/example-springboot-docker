package pl.lk.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoService {

    Logger logger = LoggerFactory.getLogger(EchoService.class);

    @GetMapping("/echo")
    public String echo(@RequestParam(name = "arg", defaultValue = "fooBar") String arg){
        logger.info(arg);
        return arg;
    }

}
