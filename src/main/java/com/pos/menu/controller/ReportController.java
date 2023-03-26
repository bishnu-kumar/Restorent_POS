package com.pos.menu.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ReportController {

	@GetMapping("/dailyreport") // this method will generate one day report by given date
	MultipartFile dailyReport(Date date) {
		return null;
	}

	@GetMapping("/monthlyReport") // this method will generate monthly report by start & end date
	MultipartFile MonthlyReport(Date startDate, Date endDate) {
		return null;
	}

}
