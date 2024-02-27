package com.jakobniinja;

import com.jakobniinja.manager.UrlService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {


  public static void main(String[] args) {
    UrlService urlService = new UrlService();

    Map<String, String> mapYoutube = new LinkedHashMap<>();
    Map<String, String> mapAdlibris = new LinkedHashMap<>();

    mapYoutube.put("Test-Driven", "https://www.youtube.com/watch?v=z6gOPonp2t0");
    mapYoutube.put("Cloud Native", "https://www.youtube.com/watch?v=a5qfg9ybltM");
    mapYoutube.put("Kafka The", "https://www.youtube.com/watch?v=uvb00oaa3k8");
    mapYoutube.put("Java Modules", "https://www.youtube.com/watch?v=UqnwQp1uHuY");
    mapYoutube.put("XP's Values", "https://www.youtube.com/watch?v=C0WiUiznoUQ");
    mapYoutube.put("The Pragmatic", "https://www.youtube.com/watch?v=0AzkH8SYyOc");
    mapYoutube.put("Amazon Web", "https://www.youtube.com/watch?v=a9__D53WsUs");
    mapYoutube.put("Clean Code", "https://www.youtube.com/watch?v=_jDNAf3CzeY");

    mapAdlibris.put("Test-Driven", "https://www.adlibris.com/se/e-bok/test-driven-java-development-9781783987436");
    mapAdlibris.put("Cloud Native",
        "https://www.adlibris.com/se/bok/cloud-native-spring-in-action-with-spring-boot-and-kubernetes-9781617298424");
    mapAdlibris.put("Kafka The", "https://www.adlibris.com/se/bok/kafka---the-definitive-guide-9781492043089");
    mapAdlibris.put("Java Modules", "https://www.adlibris.com/se/bok/the-java-module-system-9781617294280");
    mapAdlibris.put("XP's Values", "https://www.adlibris.com/se/bok/extreme-programming-explained-9780321278654");
    mapAdlibris.put("The Pragmatic", "https://www.adlibris.com/se/bok/pragmatic-programmer-the-9780135957059");
    mapAdlibris.put("Amazon Web",
        "https://www.adlibris.com/se/bok/amazon-web-services-in-action-an-in-depth-guide-to-aws-9781633439160");
    mapAdlibris.put("Clean Code", "https://www.adlibris.com/se/bok/clean-code-9780132350884");

    List<String> listYoutube = mapYoutube.values().stream().toList();
    List<String> listAdlibris = mapAdlibris.values().stream().toList();

    System.out.println("###### Videos ######");
    listYoutube.forEach(urlService::getTitle);
    System.out.println();
    System.out.println("###### Books ######");
    listAdlibris.forEach(urlService::getTitle);
  }
}
