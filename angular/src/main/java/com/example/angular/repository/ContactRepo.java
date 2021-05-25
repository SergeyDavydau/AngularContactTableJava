package com.example.angular.repository;

import com.example.angular.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {
}
