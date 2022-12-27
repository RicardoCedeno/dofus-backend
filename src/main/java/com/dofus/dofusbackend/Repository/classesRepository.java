package com.dofus.dofusbackend.Repository;

import com.dofus.dofusbackend.Entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface classesRepository extends JpaRepository<Classes, Integer> {
}
