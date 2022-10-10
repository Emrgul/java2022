package dataAccess;


import entities.Lecture;

public class JdbcLectureDao implements LectureDao {
    @Override
    public void Add(Lecture lecture) {
        System.out.println("Jdbc ile kaydedildi");
    }
}
