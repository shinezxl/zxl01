package com.tiger.demo.learn.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String firstName, lastName, job, gender;
    private int age ,salary;

}
