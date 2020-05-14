package com.zero.system.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


@Data
public class Role implements GrantedAuthority {
    private Integer id;
    private String name;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return name;
    }
}
