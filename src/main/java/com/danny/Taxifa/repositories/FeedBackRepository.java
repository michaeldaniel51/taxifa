package com.danny.Taxifa.repositories;

import com.danny.Taxifa.entities.FeedBack;
import com.danny.Taxifa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack,Integer> {

    List<FeedBack> findByUser(User user);

}