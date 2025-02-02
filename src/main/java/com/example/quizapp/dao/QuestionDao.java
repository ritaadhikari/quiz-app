package com.example.quizapp.dao;

import com.example.quizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository

public interface QuestionDao extends JpaRepository<Question,Integer> {
   List<Question> findByCategory(String category);
}
