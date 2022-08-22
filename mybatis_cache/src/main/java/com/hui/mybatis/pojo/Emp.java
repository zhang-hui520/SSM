package com.hui.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Emp implements Serializable {

    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
}
