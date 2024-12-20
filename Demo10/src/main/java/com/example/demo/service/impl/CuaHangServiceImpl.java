package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CuaHang;
import com.example.demo.repository.CuaHangRepository;
import com.example.demo.service.CuaHangService;

@Service
public class CuaHangServiceImpl implements CuaHangService {
	@Autowired
	private CuaHangRepository cuaHangRepository;

	@Override
	public List<CuaHang> findAll() {
		return cuaHangRepository.findAll();
	}

	@Override
	public CuaHang findByTen(String ten) {
		return cuaHangRepository.findByTen(ten);
	}
}
