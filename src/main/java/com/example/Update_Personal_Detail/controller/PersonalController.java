package com.example.Update_Personal_Detail.controller;

import com.example.Update_Personal_Detail.model.PersonalDetail;
import com.example.Update_Personal_Detail.service.PersonalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonalController {
    @Autowired
    PersonalDetailService service;
    @PostMapping("/adding")
    public String add(@RequestBody PersonalDetail personalDetail){
        return service.add(personalDetail);
    }
    @PatchMapping("/get/{id}")
    public String updatePersonal(@RequestBody @Validated PersonalDetail personalDetail,
                                @PathVariable Long id){
        return service.updatePersonal(personalDetail,id);
    }





}

