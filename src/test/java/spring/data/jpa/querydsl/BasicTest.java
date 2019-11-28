package spring.data.jpa.querydsl;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.data.jpa.querydsl.domain.Academy;
import spring.data.jpa.querydsl.repository.AcademyRepository;
import spring.data.jpa.querydsl.repository.AcademyRepositorySupport;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTest {

    @Autowired
    private AcademyRepository academyRepository;

    @Autowired
    private AcademyRepositorySupport academyRepositorySupport;

    @After
    public void tearDown() throws Exception {
        academyRepository.deleteAllInBatch();
    }

    @Test
    public void query_dsl_basic_test() {
        //given
        String name = "paycis";
        String address = "korea";
        academyRepository.save(new Academy(name, address));

        //when
        List<Academy> actual = academyRepositorySupport.findByName(name);

        //then
        assertThat(actual.size()).isEqualTo(1);
        assertThat(actual.get(0).getAddress()).isEqualTo(address);
    }
}
