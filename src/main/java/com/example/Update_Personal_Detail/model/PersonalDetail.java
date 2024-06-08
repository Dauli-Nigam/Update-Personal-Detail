package com.example.Update_Personal_Detail.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetail {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String email;
    String phone;
    String pinCode;

}
