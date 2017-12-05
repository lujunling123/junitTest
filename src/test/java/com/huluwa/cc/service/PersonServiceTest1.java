package com.huluwa.cc.service;

import com.huluwa.cc.Application;
import com.huluwa.cc.modual.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonServiceTest1 {
    @Autowired
    private PersonService personService;
    @Test
    public void add() throws Exception {
        Person p = new Person();
        p.setAge(15);
        p.setName("张三");
        p.setSex("男");
        Assert.assertEquals("张",personService.add(p));
    }

    @Test
    public void delete() throws Exception {
        Assert.assertEquals(true,personService.delete(1));
    }

    @Test
    public void select() throws Exception {
        Assert.assertEquals(66,personService.select(5));
    }

}