package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.beans.Project;
@Repository
public interface ProjectRdo extends JpaRepository<Project,Integer>{

}
