package com.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeUser extends BaseUser {

	public EmployeeUser(int id, String name) {
        super(id, name);
    }
}
