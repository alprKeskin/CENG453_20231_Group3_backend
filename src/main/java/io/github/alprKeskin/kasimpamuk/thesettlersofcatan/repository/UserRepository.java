package io.github.alprKeskin.kasimpamuk.thesettlersofcatan.repository;

import io.github.alprKeskin.kasimpamuk.thesettlersofcatan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    boolean existsUserByEmail(String email);
    void deleteByEmail(String email);

}