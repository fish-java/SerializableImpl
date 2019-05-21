package com.github.fish56.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sheep implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
}
