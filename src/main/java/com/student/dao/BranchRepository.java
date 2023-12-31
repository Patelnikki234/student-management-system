package com.student.dao;

import com.student.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
    List<Branch>findByDepartmentId(long departmentId);
    boolean existsByBranchName(String branchName);


}

