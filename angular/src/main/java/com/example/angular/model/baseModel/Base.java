package com.example.angular.model.baseModel;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
