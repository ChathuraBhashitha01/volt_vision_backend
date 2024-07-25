package lk.ijse.gdse.microservices.voltvision;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/volt")
public class VoltController {

    @PostMapping("/save")
    public String saveVolt(@RequestBody List<VoltDTO> voltDTO){
        System.out.println(voltDTO.toString());
        return "Volt";
    }
}
