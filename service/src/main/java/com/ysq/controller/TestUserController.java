package com.ysq.controller;

import com.ysq.model.db.TestUserDBBean;
import com.ysq.service.TestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试服务接口")
public class TestUserController {
  @Autowired private TestUserService userService;

  @RequestMapping(value = "/test_user/insert", method = RequestMethod.POST)
  @ApiOperation(value = "新增用户")
  public void insert(@ApiParam(value = "创建用户请求", required = true) TestUserDBBean testUserDBBean) {
    userService.insert(testUserDBBean);
  }

  @RequestMapping(value = "/test_user/update", method = RequestMethod.POST)
  @ApiOperation(value = "修改用户")
  public void update(@ApiParam(value = "修改用户请求", required = true) TestUserDBBean testUserDBBean) {
    userService.update(testUserDBBean);
  }

  @RequestMapping(value = "/test_user/findAll", method = RequestMethod.GET)
  @ApiOperation(value = "获取用户列表")
  public List<TestUserDBBean> findAll() {
    return userService.findAll();
  }

  @RequestMapping(value = "/test_user/delete/{id}", method = RequestMethod.DELETE)
  @ApiOperation(value = "删除用户")
  public void delete(
      @ApiParam(value = "user id", required = true) @PathVariable("id") Integer id) {
    userService.deleteById(id);
  }
}
