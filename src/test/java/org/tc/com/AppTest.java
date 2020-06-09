package org.tc.com;

import com.tc.mapper.StudentMapper;
import com.tc.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper sd= (StudentMapper) ac.getBean("studentMapper");
        Student s= sd.findStudentById("1");
        System.out.println("学生姓名:" + s.getName());
        System.out.println("学生id："+ s.getId());

    }
}
