package com.hit.kwk.mapper;
import com.hit.kwk.dao.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class MapperTest {
    @Autowired
    CityMapper cityMapper;

    @Test
    public void selectTest(){
        City c = cityMapper.getCityByID("2");
        System.out.println(c.getName());
    }

}
