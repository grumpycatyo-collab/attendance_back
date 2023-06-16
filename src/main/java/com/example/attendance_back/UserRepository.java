package com.example.attendance_back;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    @Query("SELECT u.role FROM User u WHERE u.login = :email")
    String findRoleByEmail(@Param("email") String email);
}
