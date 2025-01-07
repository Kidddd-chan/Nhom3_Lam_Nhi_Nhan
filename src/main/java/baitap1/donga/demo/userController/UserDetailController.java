package baitap1.donga.demo.userController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import baitap1.donga.demo.entity.user;

@Controller
public class UserDetailController{
    @GetMapping("/userDetail")
    public String getUserDetail(Model model){
        user lem = new user("Nhi" ,"0945462098","nhi98506@donga.edu.vn","Cẩm Lệ");
        model.addAttribute("user",lem);
        return "userDetail";
    }
}