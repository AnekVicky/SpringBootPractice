package com.springboot.excelsheet.excel.repository;

import com.springboot.excelsheet.excel.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcelRepository extends JpaRepository<Player,String> {
}
