package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CuaHang;

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, Long> {
	CuaHang findByTen(String ten);

	List<CuaHang> findAll();
}
