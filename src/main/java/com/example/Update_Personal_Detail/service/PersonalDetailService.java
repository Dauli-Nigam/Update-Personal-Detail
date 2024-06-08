package com.example.Update_Personal_Detail.service;

import com.example.Update_Personal_Detail.model.PersonalDetail;
import com.example.Update_Personal_Detail.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailService {
    @Autowired
    PersonalRepository repository;

    public String add(PersonalDetail personalDetail) {
        repository.save(personalDetail);
        return "SUCCESSFULLY ADDED TO DATABASE";
    }

    public String updatePersonal(PersonalDetail personalDetail, Long id) {
        PersonalDetail exitingPersonal = repository.findById(id).orElse(null);
        if (exitingPersonal != null) {
            if (personalDetail.getName() != null) {
                exitingPersonal.setName(personalDetail.getName());
            }
            if (personalDetail.getEmail() != null) {
                exitingPersonal.setEmail(personalDetail.getEmail());
            }
            if (personalDetail.getPhone() != null) {
                exitingPersonal.setPhone(personalDetail.getPhone());
            }
            if (personalDetail.getPinCode() != null) {
                exitingPersonal.setPinCode(personalDetail.getPinCode());
            }
            repository.save(exitingPersonal);
            return "Successfully updated to data";
        }
        return "Invalid Personal Details";
    }
}