package com.example.demo_gradle.Service;

import java.time.LocalDate;
import com.example.demo_gradle.Model.Date;


@org.springframework.stereotype.Service
public class DateService {
    int num=0;
    int version=1;

    public Date get_time()
    {
        Date date= new Date();
        date.date=LocalDate.now().toString();
        date.version=version;
        date.number_of_calls=num;
        num+=1;
        return date;
    }
}
