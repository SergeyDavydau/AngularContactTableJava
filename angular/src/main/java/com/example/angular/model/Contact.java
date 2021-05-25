package com.example.angular.model;

import com.example.angular.model.baseModel.Base;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact extends Base{

    private String name;

    private String sur_name;

    private String last_name;

    private Date date_of_birth;

    private String post_adres;

    private String home_adres;

    @JsonManagedReference
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    List<EmailAddress> email_adres;

    @JsonManagedReference
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    List<TelephonNumber> telephon_numbers;
}
