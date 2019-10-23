package com.ysq.model.db;

// @Data
public class TestUserDBBean {
  private Integer userId;
  private String userName;
  private String password;
  private String nickName;
  private Integer delFlag;

  public TestUserDBBean() {}

  public TestUserDBBean(
      Integer userId, String userName, String password, String nickName, Integer delFlag) {
    this.userId = userId;
    this.userName = userName;
    this.password = password;
    this.nickName = nickName;
    this.delFlag = delFlag;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Integer getDelFlag() {
    return delFlag;
  }

  public void setDelFlag(Integer delFlag) {
    this.delFlag = delFlag;
  }
}
