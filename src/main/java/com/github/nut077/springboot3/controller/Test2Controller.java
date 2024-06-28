package com.github.nut077.springboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {

  @GetMapping("/test2")
  public String test() {
    return "test3";
  }
}
