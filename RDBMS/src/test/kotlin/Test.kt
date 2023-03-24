import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig

@SpringJUnitConfig(Configuration::class)
abstract class AbstractRDBMSTest @Autowired constructor(private val jdbcTemplate: NamedParameterJdbcTemplate){

}