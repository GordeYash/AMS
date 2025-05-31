package com.NotesService.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notes")
public class Note {
    @Id
    private String id;
    private String patientId;
    private String doctorId;
    private String patientName;
    private String date;
    private String noteContent;
	public Note(String id, String patientId, String doctorId, String patientName, String date, String noteContent) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.date = date;
		this.noteContent = noteContent;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNoteContent() {
		return noteContent;
	}
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", patientId=" + patientId + ", doctorId=" + doctorId + ", patientName=" + patientName
				+ ", date=" + date + ", noteContent=" + noteContent + "]";
	}
	
	
    
    
}
