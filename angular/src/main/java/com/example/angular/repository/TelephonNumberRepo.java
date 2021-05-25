package com.example.angular.repository;

import com.example.angular.model.TelephonNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface TelephonNumberRepo extends JpaRepository<TelephonNumber, Long> {

    @Transactional
    @Modifying
    void deleteAllByContactId(Long id);
}
