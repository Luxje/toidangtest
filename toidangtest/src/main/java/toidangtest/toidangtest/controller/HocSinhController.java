package toidangtest.toidangtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import toidangtest.toidangtest.entity.HocSinh;
import toidangtest.toidangtest.entity.LopHoc;
import toidangtest.toidangtest.login_credentials.HocSinhLogin;
import toidangtest.toidangtest.repository.LopHocRepository;
import toidangtest.toidangtest.service.HocSinhService;

import java.util.List;


@Controller
@RequestMapping("/hocSinh")
public class HocSinhController {

    @Autowired
    private LopHocRepository lopHocRepository;

    @Autowired
    private HocSinhService hocSinhService;

    private String message = "check message";
    @GetMapping("/Login")
    public String getAllData(@ModelAttribute("adminLogin") HocSinhLogin login, Model model)
    {
        String hoTen = login.getHoTen();
        Integer idHocSinh = login.getIdHocSinh();
        if(hocSinhService.LoginCheck(hoTen, idHocSinh) == true){
            return "redirect:/Student/service";
        }else{
            model.addAttribute("error", "Invalid username or password");
            return "Login";
        }
    }

    @GetMapping("/service")
    public String returnBack(Model model){
        List<HocSinh> hocSinhList = this.hocSinhService.getAll();
        List<LopHoc> lopHocList = (List<LopHoc>) this.lopHocRepository.findAll();
        model.addAttribute("hocSinh", hocSinhList);
        model.addAttribute("lopHoc", lopHocList);
        return "data-hocSinh";
    }

    @GetMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        this.hocSinhService.delete(id);
        return "redirect:/Student/service";
    }

    @GetMapping("/addStudent")
    public String addStudentPage(){
        return "Add_Student";
    }

    @PostMapping("addingStudent")
    public String addStudent( @ModelAttribute HocSinh hocSinh){
        this.hocSinhService.add(hocSinh);
        return "redirect:/Student/service";
    }
}
