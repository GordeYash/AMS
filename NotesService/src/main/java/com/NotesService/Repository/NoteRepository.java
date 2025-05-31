package com.NotesService.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.NotesService.Entity.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note, String> {
}
