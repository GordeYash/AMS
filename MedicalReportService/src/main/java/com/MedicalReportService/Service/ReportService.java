package com.MedicalReportService.Service;


import org.springframework.stereotype.Service;

import com.MedicalReportService.Entity.Report;
import com.MedicalReportService.Repository.ReportRepository;

import java.util.List;

@Service
public class ReportService {

    private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public Report saveReport(Report report) {
        return reportRepository.save(report);
    }

    public List<Report> getReportsByUserId(String userId) {
        return reportRepository.findByUserId(userId);
    }
}
