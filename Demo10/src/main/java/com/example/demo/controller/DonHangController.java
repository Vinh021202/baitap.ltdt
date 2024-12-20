package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.DonHang;
import com.example.demo.repository.DonHangRepository;
import com.example.demo.service.CuaHangService;
import com.example.demo.service.DonHangService;

@Controller
@RequestMapping("/donhang")
public class DonHangController {
	@Autowired
	private DonHangService donHangService;

	@Autowired
	private DonHangRepository donHangRepository;

	@Autowired
	private CuaHangService cuaHangService;

	@GetMapping
	public String listDonHang(Model model) {
		model.addAttribute("donhangs", donHangService.findAll());
		return "donhang/list";
	}

	@GetMapping("/search")
	public String search(@RequestParam String keyword, Model model) {
		model.addAttribute("donhangs", donHangService.search(keyword));
		return "donhang/list";
	}

	@GetMapping("/add")
	public String addForm(Model model) {
		// Tạo đối tượng DonHang mới
		model.addAttribute("donHang", new DonHang());
		// Thêm danh sách cửa hàng vào Model
		model.addAttribute("cuaHangs", cuaHangService.findAll());
		return "donhang/add";
	}

	@PostMapping("/add")
	public String save(@ModelAttribute DonHang donHang, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "donhang/add";
		}
		donHang.setMaDonHang(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
		donHangService.save(donHang);
		return "redirect:/donhang";
	}

	// Xử lý Validate Đơn hàng
//	@PostMapping("/add")
//	public String save(@ModelAttribute DonHang donHang, BindingResult result, Model model) {
//		// Kiểm tra Email trùng
//		if (donHangRepository.existsByEmailAndTrangThaiAndNgayDatHang(donHang.getEmail(), 0,
//				donHang.getNgayDatHang())) {
//			model.addAttribute("error", "Email đã có đơn hàng tạm trong ngày này!");
//			return "donhang/add";
//		}
//
//		// Kiểm tra ngày đặt hàng lớn hơn ngày hiện tại
//		if (donHang.getNgayDatHang().isBefore(LocalDate.now())) {
//			model.addAttribute("error", "Ngày đặt hàng phải lớn hơn hoặc bằng ngày hiện tại!");
//			return "donhang/add";
//		}
//
//		// Sinh mã đơn hàng tự động
//		donHang.setMaDonHang(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
//		donHangService.save(donHang);
//		return "redirect:/donhang";
//	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		DonHang donHang = donHangService.findAll().stream().filter(d -> d.getId().equals(id) && d.getTrangThai() == 0)
				.findFirst().orElse(null);
		if (donHang != null) {
			donHangService.deleteById(id);
		}
		return "redirect:/donhang";
	}
}
