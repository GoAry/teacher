package com.teacher.english.dao;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class NewTeacherDAO {

  public void execute () {
    try {
      PDDocument document = null;
      document = PDDocument.load(new File("/Users/yg/Downloads/abc.pdf"));
      document.getClass();
      if (!document.isEncrypted()) {
        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
        stripper.setSortByPosition(true);
        PDFTextStripper Tstripper = new PDFTextStripper();
        String st = Tstripper.getText(document);
        System.out.println("Text:" + st);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
