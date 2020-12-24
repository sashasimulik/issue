package shipping.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingProjectApplication {

    @GetMapping("/hello")
    public String index() {
        return "Hello there!";
    }

}
