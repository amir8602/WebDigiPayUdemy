package org.team.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.PostConstruct;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String family;
    private int age;



}
