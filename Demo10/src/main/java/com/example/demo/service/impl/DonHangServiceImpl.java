package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DonHang;
import com.example.demo.repository.DonHangRepository;
import com.example.demo.service.DonHangService;

@Service
public class DonHangServiceImpl implements DonHangService {
	@Autowired
	private DonHangRepository donHangRepository;

	@Override
	public List<DonHang> findAll() {
		return donHangRepository.findAll();
	}

	@Override
	public List<DonHang> search(String keyword) {
		return donHangRepository.findByMaDonHangContainingOrCuaHang_TenContaining(keyword, keyword);
	}

	@Override
	public DonHang save(DonHang donHang) {
		return donHangRepository.save(donHang);
	}

	@Override
	public void deleteById(Long id) {
		donHangRepository.deleteById(id);
	}
}
