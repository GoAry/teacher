package com.teacher.english.bo;

import com.teacher.english.dao.NewTeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class NewTeacherBO {

  @Autowired
  private NewTeacherDAO newTeacherDAO;

  public void execute() {
    this.newTeacherDAO.execute();
  }
  public void setNewTeacherDAO(NewTeacherDAO newTeacherDAO) {
    this.newTeacherDAO = newTeacherDAO;
  }
}
