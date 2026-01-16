package es.fplumara.dam2.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fplumara.dam2.springdemo.domain.Note;

public interface NoteRepository extends JpaRepository<Note, Long> { }