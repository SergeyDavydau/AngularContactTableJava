package com.example.angular.repository;

import com.example.angular.model.EmailAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface EmailAddressRepo extends JpaRepository<EmailAddress, Long> {

    @Transactional
    @Modifying
    void deleteAllByContactId(Long id);
}
