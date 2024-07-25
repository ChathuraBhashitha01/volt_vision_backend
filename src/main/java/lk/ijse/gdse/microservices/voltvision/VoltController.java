package lk.ijse.gdse.microservices.voltvision;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/volt")
@CrossOrigin
public class VoltController {

    @GetMapping("/getAll")
    public void getMethod(){
        System.out.println("GET Method");
    }

    @PostMapping("/save")
    public String saveVolt(@RequestBody List<VoltDTO> voltDTO){
        System.out.println(voltDTO.toString());
        return "Volt";
    }
}
