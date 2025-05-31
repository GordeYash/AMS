package com.MedicalReportService.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userId; // Foreign key to track user details

    @Column(nullable = false)
    private String uploadedBy;

    @Column(nullable = false)
    private String uploaderName;

    @Column(nullable = false)
    private String dateUploaded;

    @Column(nullable = false)
    private String reportName;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String reportFile; // Base64-encoded file

    private String hospitalName;

    private String doctorName;

    @Column(nullable = false)
    private String reportType;

    @Column(length = 1000)
    private String description;

	public Report(Long id, String userId, String uploadedBy, String uploaderName, String dateUploaded, String reportName,
			String reportFile, String hospitalName, String doctorName, String reportType, String description) {
		super();
		this.id = id;
		this.userId = userId;
		this.uploadedBy = uploadedBy;
		this.uploaderName = uploaderName;
		this.dateUploaded = dateUploaded;
		this.reportName = reportName;
		this.reportFile = reportFile;
		this.hospitalName = hospitalName;
		this.doctorName = doctorName;
		this.reportType = reportType;
		this.description = description;
	}

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public String getUploaderName() {
		return uploaderName;
	}

	public void setUploaderName(String uploaderName) {
		this.uploaderName = uploaderName;
	}

	public String getDateUploaded() {
		return dateUploaded;
	}

	public void setDateUploaded(String dateUploaded) {
		this.dateUploaded = dateUploaded;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportFile() {
		return reportFile;
	}

	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", userId=" + userId + ", uploadedBy=" + uploadedBy + ", uploaderName="
				+ uploaderName + ", dateUploaded=" + dateUploaded + ", reportName=" + reportName + ", reportFile="
				+ reportFile + ", hospitalName=" + hospitalName + ", doctorName=" + doctorName + ", reportType="
				+ reportType + ", description=" + description + "]";
	}
    
    
    
}
