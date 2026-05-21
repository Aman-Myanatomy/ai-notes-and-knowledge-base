package com.myanatomy.notesapp.exception;


public class NoteNotFoundException extends RuntimeException {
      public NoteNotFoundException(String id) {
        super("Note not found with id: " + id);
    }

}