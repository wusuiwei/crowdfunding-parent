package com.atguigu.crowdfunding.mapper;

import com.atguigu.entities.SysDictionary;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDictionaryMapper {

    @Select("select * from sys_dictionary where dict_id=1")
    SysDictionary selectOne();

}
