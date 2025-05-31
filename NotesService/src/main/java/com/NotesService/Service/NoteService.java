package com.NotesService.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NotesService.Entity.Note;
import com.NotesService.Repository.NoteRepository;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public List<Note> getNotesByPatientId(String patientId) {
        return noteRepository.findAll()
                .stream()
                .filter(note -> note.getPatientId().equals(patientId))
                .toList();
    }

    public List<Note> getNotesByDoctorId(String doctorId) {
        return noteRepository.findAll()
                .stream()
                .filter(note -> note.getDoctorId().equals(doctorId))
                .toList();
    }
}
