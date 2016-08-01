package com.levelup.lesson1.task4;
import java.util.Arrays;
public class NoteBook {
    Note notes[] = new Note[10];
    private int countNotes = 0;

    public int serchIndexNote(String s) {
        for (int i = 0; i < countNotes; i++) {
            if (notes[i].equals(s)) ;
            return i;
        }
        return -1;
    }

    public boolean addNote(String s) {
        if (countNotes < notes.length) {
            notes[countNotes].setS(s);//// TODO: 01.08.2016  
            countNotes++;
            return true;
        }
        System.out.println("Блокнот закончился");
        return false;
    }

    public boolean deleteNote(String s) {
        int i = serchIndexNote(s);
        if (i != -1) {
            notes[i] = null;
            countNotes--;
            return true;
        }
        return false;
    }

    public boolean changeNote(String s1, String s2) {
        int i = serchIndexNote(s1);
        if (i != -1) {
            notes[i].setS(s2);
            return true;
        }
        return false;
    }

    public void seeAllNotes(){
        for (int i = 0; i <countNotes ; i++) {
            System.out.println(notes[i].getS());
        }
    }
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        noteBook.addNote("Bla-bla-bla");
        noteBook.addNote("vtoray zapis'");
        noteBook.seeAllNotes();
    }
}
