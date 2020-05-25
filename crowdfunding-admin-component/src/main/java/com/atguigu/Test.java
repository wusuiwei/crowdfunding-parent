package com.atguigu;


import com.atguigu.crowdfunding.mapper.SysDictionaryMapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:/spring-persist-mybatis.xml"})
public class Test {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SysDictionaryMapper sysDictionaryMapper;

    @org.junit.jupiter.api.Test
    void testDatasource() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        System.out.println(sysDictionaryMapper.selectOne());

    }
}
