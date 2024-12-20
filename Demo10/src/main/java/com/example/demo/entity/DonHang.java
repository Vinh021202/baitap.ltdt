package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DONHANG")
public class DonHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String maDonHang;

	@Column(nullable = false, length = 50)
	private String tenKhachHang;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private LocalDate ngayDatHang;

	@Column(nullable = false)
	private String tenSP;

	@Column(nullable = false)
	private int trangThai;

	@ManyToOne
	@JoinColumn(name = "maCuaHang", nullable = false)
	private CuaHang cuaHang;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaDonHang() {
		return maDonHang;
	}

	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNgayDatHang() {
		return ngayDatHang;
	}

	public void setNgayDatHang(LocalDate ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public CuaHang getCuaHang() {
		return cuaHang;
	}

	public void setCuaHang(CuaHang cuaHang) {
		this.cuaHang = cuaHang;
	}

	public DonHang() {
		super();
	}

	public DonHang(Long id, String maDonHang, String tenKhachHang, String email, LocalDate ngayDatHang, String tenSP,
			int trangThai, CuaHang cuaHang) {
		super();
		this.id = id;
		this.maDonHang = maDonHang;
		this.tenKhachHang = tenKhachHang;
		this.email = email;
		this.ngayDatHang = ngayDatHang;
		this.tenSP = tenSP;
		this.trangThai = trangThai;
		this.cuaHang = cuaHang;
	}

	@Override
	public String toString() {
		return "DonHang [id=" + id + ", maDonHang=" + maDonHang + ", tenKhachHang=" + tenKhachHang + ", email=" + email
				+ ", ngayDatHang=" + ngayDatHang + ", tenSP=" + tenSP + ", trangThai=" + trangThai + ", cuaHang="
				+ cuaHang + "]";
	}

}
