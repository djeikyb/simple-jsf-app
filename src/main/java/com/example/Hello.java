package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Hello
{
  private final Logger log = LoggerFactory.getLogger(this.getClass());

  public String getHi()
  {
    log.trace("getHi()");
    return "hello world";
  }

}
