package com.huluwa.cc.service;

import com.huluwa.cc.modual.Person;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonService {

    public String add (Person p) {

        return p.getName();
    }
    public boolean delete (int id) {

        if (id%2 == 0) {
            return true;
        }
        return false;
    }

    public int select (Integer id) {
        if (id == null || id == 0) {
            return 66;
        }
        //如果id不为空则随机
        return new Random().nextInt();
    }
}
