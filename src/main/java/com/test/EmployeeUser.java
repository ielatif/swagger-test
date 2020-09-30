package com.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeUser extends BaseUser {
    public EmployeeUser(@JsonProperty("id") int id,
                     @JsonProperty("name") String name) {
        super(id, name);
    }
}
