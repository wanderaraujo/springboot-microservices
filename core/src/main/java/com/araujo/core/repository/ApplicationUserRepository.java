package com.araujo.core.repository;

import com.araujo.core.model.ApplicationUser;
import com.araujo.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);

}
