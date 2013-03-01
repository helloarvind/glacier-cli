package com.utsav.common.helper;

import java.io.FileWriter;

import junit.framework.TestCase;

import org.junit.Test;

public class FileAppenderTest extends TestCase {

  @Test
  public void testFileAppender() {
    FileWriter upLoadedArchiveList;
    try {
      upLoadedArchiveList = new FileWriter("uploaded-archive.csv", true);
      upLoadedArchiveList.write("UploadedFile" + "," + "Archive Id" + "," + "Date");
      upLoadedArchiveList.close();
      assertTrue(true);
    } catch (Exception e) {
      e.printStackTrace();
      fail();
    }

  }

}
