package com.tc.mapper;

import com.tc.pojo.Student;

//
//Mapper接口开发方法只需要程序员编写Mapper接口
//        • 一个接口;一个Mapper配置文件

public interface StudentMapper {
    public Student findStudentById(String id);

}
