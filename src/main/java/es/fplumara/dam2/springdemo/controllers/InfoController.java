package es.fplumara.dam2.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fplumara.dam2.springdemo.domain.AppInfo;

@RestController
public class InfoController {

  private final AppInfo appInfo;

  public InfoController(AppInfo appInfo) {
    this.appInfo = appInfo;
  }

  @GetMapping("/info")
  public AppInfo info() {
    return appInfo;
  }
}

/*
//PUNTO 5 - SOLUCIÓN B - PARTE INFO
@RestController
public class InfoController {

  private final AppInfo appInfo;

  public InfoController(@Qualifier("devInfo") AppInfo appInfo) {
    this.appInfo = appInfo;
  }

  @GetMapping("/info")
  public AppInfo info() {
    return appInfo;
  }
}
*/