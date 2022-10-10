import business.LectureManager;
import core.logging.DatabaseLogging;
import core.logging.FileLogging;
import core.logging.Logger;
import dataAccess.JdbcLectureDao;
import entities.Lecture;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Lecture lecture1 = new Lecture(1,"kodlama","yazılım","engin demiroğ",134999);
        Lecture lecture2 =new Lecture(2,"kodlama","yazılım b","engin demiroğ",1233);

        Logger[] loggers = {new DatabaseLogging(),new FileLogging()};

        LectureManager lectureManager = new LectureManager(new JdbcLectureDao(),loggers);

        lectureManager.get(lecture1);
        lectureManager.get(lecture2);


    }
}
