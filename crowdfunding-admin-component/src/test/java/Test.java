import com.wusuiwei.crowdfunding.entity.Admin;
import com.wusuiwei.crowdfunding.mapper.AdminMapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-persist-mybatis.xml")
public class Test {

    @Autowired
    DataSource datasource;

    @Autowired
    AdminMapper adminMapper;

    @org.junit.jupiter.api.Test
    void testDatasource() throws SQLException {
        Connection connection = datasource.getConnection();
        System.out.println(connection);
    }


    @org.junit.jupiter.api.Test
    void testMapper() {
        Admin admin = adminMapper.selectByPrimaryKey(1);
        System.out.println(admin);
    }
}
