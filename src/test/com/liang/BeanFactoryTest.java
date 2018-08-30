package com.liang;


import com.liang.bean.MyTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
//@WebAppConfiguration("src/main/webapp")
public class BeanFactoryTest {

    @Test
    public void testSingLoad() {
        XmlBeanFactory xbf = new XmlBeanFactory(new ClassPathResource("beanFactoryBean.xml"));
        MyTestBean testBean = (MyTestBean) xbf.getBean("myTestBean");
        Assert.assertEquals("testStr", testBean.getTestStr());
    }
}
