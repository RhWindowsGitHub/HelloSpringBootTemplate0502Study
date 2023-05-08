package cola.study.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cola_Ubuntu
 * @name ColaController
 * @DATE 2023/5/8 上午7:33
 * @description ColaController
 */
@RestController
@Slf4j
@RequestMapping("v1/api/cola")
public class ColaController {

    @RequestMapping("sayHello")
    public String sayHello(){
        return "Hello I am Cola";
    }
}
