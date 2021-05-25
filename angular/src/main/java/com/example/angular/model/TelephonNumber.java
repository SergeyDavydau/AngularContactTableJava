package com.example.angular.model;

import com.example.angular.model.baseModel.Base;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class TelephonNumber extends Base {
    private String number;

    private boolean chosen = false;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Contact contact;

    public TelephonNumber(String number) {
        this.number = number;
    }

}
