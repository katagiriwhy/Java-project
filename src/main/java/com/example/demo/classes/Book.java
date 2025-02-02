package com.example.demo.classes;

public class Book {
  private Long id;
  private String first_name;
  private String last_name;
  private String parther_name;
  private String passport_seria;
  private String passport_num;

  public Book(String passport_num, String first_name, String last_name, String parther_name, String passport_seria) {
    this.passport_num = passport_num;
    this.first_name = first_name;
    this.last_name = last_name;
    this.parther_name = parther_name;
    this.passport_seria = passport_seria;
  }

  public Book() {
  }

  public Book(Long id, String first_name, String last_name, String parther_name, String passport_seria, String passport_num) {
    this.id = id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.parther_name = parther_name;
    this.passport_seria = passport_seria;
    this.passport_num = passport_num;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getParther_name() {
    return parther_name;
  }

  public void setParther_name(String parther_name) {
    this.parther_name = parther_name;
  }

  public String getPassport_seria() {
    return passport_seria;
  }

  public void setPassport_seria(String passport_seria) {
    this.passport_seria = passport_seria;
  }

  public String getPassport_num() {
    return passport_num;
  }

  public void setPassport_num(String passport_num) {
    this.passport_num = passport_num;
  }
}
