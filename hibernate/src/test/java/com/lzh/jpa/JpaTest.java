package com.lzh.jpa;

import com.lzh.domain.Student;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {

    /**
     * 1、加载配置文件创建工厂
     * 2、通过实体管理类工厂获取实体管理器
     * 3、获取事务对象，开启事务
     * 4、完成CURD操作
     * 5、提交事务（回滚事务）
     * 6、释放资源
     *
     */
    @Test
    public void testSave() {

        //1、加载配置文件创建工厂

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");

        //2、通过实体管理类工厂获取实体管理器
        EntityManager em = factory.createEntityManager();
        //3、获取事务对象，开启事务
        EntityTransaction transaction = em.getTransaction();
        //开启事务
        transaction.begin();
        //增加
        Student student = new Student("罗泽华","男",-1);
        em.persist(student);
        //提交事务
        transaction.commit();
        //6、释放资源
        em.close();
        factory.close();


    }
}
