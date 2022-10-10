package business;

import core.logging.Logger;
import dataAccess.LectureDao;
import entities.Lecture;

import java.util.ArrayList;
import java.util.List;


public class LectureManager {

    private LectureDao lectureDao;
    public Logger[] loggers;

    List<Lecture> lectures = new ArrayList<>();

    public LectureManager(LectureDao lectureDao , Logger[] loggers) {
        this.lectureDao = lectureDao;
        this.loggers=loggers;
    }


    public void get(Lecture lecture) throws Exception{
        if (lecture.getPrice()<0){
            throw new Exception("Ders fiyatı 0'dan küçük olamaz");
        }

        for(Lecture lecture1:lectures){
            if (lecture1.getLectureName()==lecture.getLectureName()){
                throw new Exception("Girilen kurs isimleri aynı olamaz");
            }

            if (lecture1.getCategory()==lecture.getCategory()){
                throw new Exception("Girilen kurs kategorileri aynı olamaz");
            }

        }

        lectures.add(lecture);
        lectureDao.Add(lecture);


        for (Logger logger:loggers){

           logger.log(lecture.getLectureName());

        }

    }
}
