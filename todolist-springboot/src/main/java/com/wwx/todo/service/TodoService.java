package com.wwx.todo.service;

import com.wwx.todo.model.Todo;
import com.wwx.todo.model.TodoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TodoService {
    long countByExample(TodoExample example);

    int deleteByExample(TodoExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(Todo record);

    int insertSelective(Todo record);

    List<Todo> selectByExample(TodoExample example);

    Todo selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") Todo record, @Param("example") TodoExample example);

    int updateByExample(@Param("record") Todo record, @Param("example") TodoExample example);

    int updateByPrimaryKeySelective(Todo record);

    int updateByPrimaryKey(Todo record);
}
