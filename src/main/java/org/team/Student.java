package org.team;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Data

@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favo_lang;
    private ArrayList<String> os;

    private LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("br", "brazil");
        countryOptions.put("fr", "france");
        countryOptions.put("de", "germany");
        countryOptions.put("in", "brazil");

    }
}
