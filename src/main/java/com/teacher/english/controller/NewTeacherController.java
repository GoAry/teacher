package com.teacher.english.controller;

import com.teacher.english.bo.NewTeacherBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yg on 2017. 7. 14..
 */
@Controller
public class NewTeacherController {


  @Autowired
  private NewTeacherBO newTeacherBO;


  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView searchHome(
  ) {
    ModelAndView mav = new ModelAndView("new");

    newTeacherBO.execute();

    return mav;
  }

}
