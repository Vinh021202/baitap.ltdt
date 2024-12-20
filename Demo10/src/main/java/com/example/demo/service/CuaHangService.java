package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CuaHang;

public interface CuaHangService {
	List<CuaHang> findAll();

	CuaHang findByTen(String ten);
}
