import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactory
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType
import org.springframework.transaction.PlatformTransactionManager
import javax.sql.DataSource

@Configuration
open class Configuration {

    @Bean
    fun dataSource() : DataSource =
        EmbeddedDatabaseBuilder()
            .setType(EmbeddedDatabaseType.H2)
            .addScript("classpath:script.sql")
            .build()

    @Bean
    fun transactionManager(dataSource: DataSource) : PlatformTransactionManager = DataSourceTransactionManager(dataSource)

    @Bean
    fun namedJdbcTemplate(dataSource: DataSource) : NamedParameterJdbcTemplate = NamedParameterJdbcTemplate(dataSource)

}