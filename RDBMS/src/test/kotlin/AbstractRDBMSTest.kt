import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig
import org.springframework.transaction.annotation.Transactional

@SpringJUnitConfig(Configuration::class)
@Transactional
abstract class AbstractRDBMSTest{

    protected lateinit var jdbcTemplate: NamedParameterJdbcTemplate

}