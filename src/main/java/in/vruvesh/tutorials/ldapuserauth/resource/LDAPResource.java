package in.vruvesh.tutorials.ldapuserauth.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LDAPResource {

    @GetMapping("/")
    public String home(){
        return "Home Resource";
    }
}
