package com.ysq.repository;

import com.ysq.model.db.TestUserDBBean;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestUserRepository {
  int insert(@Param("bean") TestUserDBBean bean);

  int delete(@Param("id") Integer id);

  int update(@Param("bean") TestUserDBBean bean);

  List<TestUserDBBean> findAll();
}
