package com.jakobniinja.manager;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class UrlService {

  public void getTitle(String url) {
    try {
      Document doc = Jsoup.connect(url).get();
      System.out.println(doc.title());

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
