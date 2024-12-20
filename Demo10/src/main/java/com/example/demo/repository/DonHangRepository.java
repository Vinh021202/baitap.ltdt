package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.DonHang;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang, Long> {
	List<DonHang> findByMaDonHangContainingOrCuaHang_TenContaining(String maDonHang, String tenCuaHang);

	boolean existsByEmailAndTrangThaiAndNgayDatHang(String email, int trangThai, LocalDate ngayDatHang);

}
