package cn.com.rx;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"cn.com.rx"})
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@Configurable
public class TestBase {
}
