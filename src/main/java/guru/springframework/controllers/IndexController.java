package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


/负责接受浏览器发送过来的请求
public class IndexController {
    @RequestMapping("/")
    ///当有人访问“/”执行下面的方法， 把url和方法对应起来
    String index(){
        return "index";
//index的页面
    }
}
打开首页
