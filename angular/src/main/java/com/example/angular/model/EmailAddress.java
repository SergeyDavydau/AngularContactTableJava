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
public class EmailAddress extends Base {
    private String adress;

    private boolean chosen = false;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Contact contact;

    public EmailAddress(String adress) {
        this.adress = adress;
    }

}
