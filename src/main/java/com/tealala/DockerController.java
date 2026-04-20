package com.tealala;
 
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class DockerController {
    static Log LOGGER = LogFactory.getLog(DockerController.class);
 
    @RequestMapping("/docker")
    public String index(){
        LOGGER.info("hello docker!");
        return "Hello Docker!";
    }
}