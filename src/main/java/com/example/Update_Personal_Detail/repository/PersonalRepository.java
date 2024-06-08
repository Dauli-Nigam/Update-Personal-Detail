package com.example.Update_Personal_Detail.repository;

import com.example.Update_Personal_Detail.model.PersonalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonalRepository extends JpaRepository<PersonalDetail,Long> {
    Optional<PersonalDetail> findById(Long id);


}
