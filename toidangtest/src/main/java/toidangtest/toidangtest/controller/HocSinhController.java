package toidangtest.toidangtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import toidangtest.toidangtest.login_credentials.HocSinhLogin;
import toidangtest.toidangtest.service.HocSinhService;


@Controller
public class HocSinhController {

    @Autowired
    private HocSinhService hocSinhService;

    private String message = "check message";

    @GetMapping("/AdminLogin")
    public String getAllData(@ModelAttribute("adminLogin") HocSinhLogin login, Model model)
    {
        String email = login.getEmail();
        String password = login.getPassword();
        if(hocSinhService.validateAdminCredentials(email, password) == true){
            return "redirect:/admin/service";
        }else{
            model.addAttribute("error", "Invalid username or password");
            return "Login";
        }
    }

//    @GetMapping("/admin/services")
//    public String informationView(Model model){
//
//    }


}
