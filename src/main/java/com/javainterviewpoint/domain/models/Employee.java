package com.javainterviewpoint.domain.models;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Employee implements Serializable 
{
    private static final long serialVersionUID = -889976693182180703L;
    @ApiModelProperty(value="Id of the Employee (primary key field)")
    private Long id;
    @ApiModelProperty(value="Name of the Employee")
    private String name;
    @ApiModelProperty(value="Age of the Employee")
    private Long age;
    @ApiModelProperty(value="Department of the Employee")
    private String dept;
    public Employee()
    {
        super();
    }
    public Employee(Long id, String name, Long age, String dept)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Long getAge()
    {
        return age;
    }
    public void setAge(Long age)
    {
        this.age = age;
    }
    public String getDept()
    {
        return dept;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
    }
}