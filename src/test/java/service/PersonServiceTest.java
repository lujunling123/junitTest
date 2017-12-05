package service;

import com.huluwa.cc.Application;
import com.huluwa.cc.modual.Person;
import com.huluwa.cc.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonServiceTest {
    @Autowired
    private PersonService personService;
    @Test
    public  void add () {
        Person p = new Person();
        p.setAge(15);
        p.setName("张三");
        p.setSex("男");
        Assert.assertEquals("张",personService.add(p));
    }


}
