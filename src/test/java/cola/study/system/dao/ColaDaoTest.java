package cola.study.system.dao;

import cola.study.system.pojo.Cola;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ColaDaoTest {

    @Resource
    private ColaDao colaDao;
    @Test
    void saveCola() {
        Cola cola = new Cola(null,"Cola",21,"1203952894@qq.com");

        Cola save = colaDao.save(cola);
        System.out.println(save);
    }

    @Test
    void getColaById() {
        Optional<Cola> cola = colaDao.findById(3);
        cola.ifPresent(System.out::println);
    }

    @Test
    void updateColaById() {
        Optional<Cola> cola = colaDao.findById(3);
        cola.ifPresent(cola1 -> {
            cola1.setName("RH");
            cola1.setAge(22);
            Cola save = colaDao.save(cola1);
            System.out.println(save);
        });
    }

    @Test
    void loginDeleteColaById(){
        colaDao.logicDeleteById(4);
        Assertions.assertTrue(colaDao.findById(2).isEmpty());
    }

    @Test
    void findAllCola() {
        List<Cola> colaList = colaDao.findAll();
        colaList.forEach(System.out::println);
    }
}