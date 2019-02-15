package cn.liuxingwei.judge.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 数据源相关配置
 * @author liuxingwei
 */
@Configuration
@EnableTransactionManagement
public class DataConfiguration {

    /**
     * mysql driver 变量，取自外挂配置文件
     * @author liuxingwei
     */
    @Value("${spring.datasource.driver-class-name}")
    private String mysqlDriver;

    /**
     * mysql 连接 url，取自外挂配置文件
     * @author liuxingwei
     */
    @Value("${spring.datasource.url}")
    private String mysqlUrl;

    /**
     * mysql 连接用户名，取自外挂配置文件
     * @author liuxingwei
     */
    @Value("${spring.datasource.username}")
    private String mysqlUsername;

    /**
     * mysql 连接密码，取自外挂配置文件
     */
    @Value("${spring.datasource.password}")
    private String mysqlPassword;

    /**
     * 数据源（dataSource）定义
     * @author liuxingwei
     * @return DataSource
     */
    @Bean
    public PooledDataSource dataSource() {
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver(mysqlDriver);
        dataSource.setUrl(mysqlUrl);
        dataSource.setUsername(mysqlUsername);
        dataSource.setPassword(mysqlPassword);
        return dataSource;
    }

}
