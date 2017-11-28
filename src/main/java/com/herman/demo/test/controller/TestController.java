package com.herman.demo.test.controller;

import com.herman.common.controller.BaseController;
import com.herman.demo.test.entity.Test;
import com.herman.demo.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/11/27.
 */

@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private ITestService testService;

    @RequestMapping("index")
    @ResponseBody
    public ModelAndView index() {
        return new ModelAndView("test/index");
    }

    @RequestMapping("data")
    @ResponseBody
    public Test getTest() {
        return testService.getTest(1L);
    }

}
