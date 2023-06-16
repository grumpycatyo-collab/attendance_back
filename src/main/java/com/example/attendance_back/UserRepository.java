package com.example.attendance_back;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT CASE WHEN t.id IS NOT NULL THEN 'Teacher' " +
            "            WHEN a.id IS NOT NULL THEN 'Admin' " +
            "            WHEN s.id IS NOT NULL THEN 'Student' " +
            "            ELSE 'Unknown' " +
            "       END " +
            "FROM Teacher t " +
            "LEFT JOIN Admin a ON a.id = t.id " +
            "LEFT JOIN Student s ON s.id = t.id " +
            "WHERE t.login = :email OR a.login = :email OR s.login = :email")
    String findRoleByEmail(@Param("email") String email);
}
