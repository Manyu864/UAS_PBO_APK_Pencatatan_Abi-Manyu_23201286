/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.List;

/**
 *
 * @author STATION20B
 */
public final class NoteService {

    private final DataStorage storage;
    private final List<String> notes;

    public NoteService(DataStorage storage) {
        this.storage = storage;
        this.notes = readNotes();
    }

    public void createNote(String note) {
        storage.writeData(note);
        notes.add(note);
    }

    public List<String> readNotes() {
        return storage.readData();
    }

    public void deleteNote(String note) {
        notes.remove(note);
        storage.deleteData(note);
    }

    public int getNoteCount() {
        return notes.size();
    }

    public String getNoteByIndex(int index) {
        return notes.get(index);
    }
}
