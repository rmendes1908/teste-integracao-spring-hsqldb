package br.com.cerveja.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.cerveja.modelo.Cerveja;

@Sql(value = "/load-database.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@Sql(value = "/clean-database.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
@RunWith(SpringRunner.class)
@DataJpaTest
@TestPropertySource("classpath:application-test.properties")
public class CervejaRepositoryTest {
	
	@Autowired
    private CervejaRepository cervejaRepository;
	
	@Test
    public void deveBuscarTodasCervejasCadastradas() throws Exception {
		
		List<Cerveja> cervejas = cervejaRepository.findAll();

        assertThat(cervejas.size()).isEqualTo(1);

    }

}
