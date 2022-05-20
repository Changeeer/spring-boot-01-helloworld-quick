package com.mytest.springboot.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

public class Department {

    private Long id;
    @NotNull
    private String name;
    private Department parent;
    private boolean lock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getParent() {
        return parent;
    }

    public void setParent(Department parent) {
        this.parent = parent;
    }

    public String getOriginalName() {
        if (this.parent!=null) {
            return parent.getOriginalName();
        } else {
            return name;
        }
    }
}
