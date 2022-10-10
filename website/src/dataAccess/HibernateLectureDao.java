package dataAccess;

import entities.Lecture;

public class HibernateLectureDao implements LectureDao{
    @Override
    public void Add(Lecture lecture) {
        System.out.println("Hibernate ile kaydedildi.");
    }
}
