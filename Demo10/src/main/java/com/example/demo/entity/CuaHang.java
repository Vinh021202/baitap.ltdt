package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUAHANG")
public class CuaHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long maCuaHang;

	@Column(nullable = false)
	private String ten;

	public Long getMaCuaHang() {
		return maCuaHang;
	}

	public void setMaCuaHang(Long maCuaHang) {
		this.maCuaHang = maCuaHang;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public CuaHang() {
		super();
	}

	public CuaHang(Long maCuaHang, String ten) {
		super();
		this.maCuaHang = maCuaHang;
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "CuaHang [maCuaHang=" + maCuaHang + ", ten=" + ten + "]";
	}

}
