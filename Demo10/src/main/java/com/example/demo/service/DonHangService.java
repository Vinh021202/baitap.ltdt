package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.DonHang;

public interface DonHangService {
	List<DonHang> findAll();

	List<DonHang> search(String keyword);

	DonHang save(DonHang donHang);

	void deleteById(Long id);
}
