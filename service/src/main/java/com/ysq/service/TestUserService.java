package com.ysq.service;

import com.ysq.model.db.TestUserDBBean;
import com.ysq.repository.TestUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestUserService {
  @Autowired
  private TestUserRepository testUserRepository;

  public TestUserService() {}

  public TestUserService(TestUserRepository testUserRepository) {
    this.testUserRepository = testUserRepository;
  }

  public void insert(TestUserDBBean testUserDBBean) {
    testUserRepository.insert(testUserDBBean);
  }

  public void deleteById(Integer id) {
    testUserRepository.delete(id);
  }

  public List<TestUserDBBean> findAll() {
    return testUserRepository.findAll();
  }

  public void update(TestUserDBBean testUserDBBean) {
    testUserRepository.update(testUserDBBean);
  }
}
