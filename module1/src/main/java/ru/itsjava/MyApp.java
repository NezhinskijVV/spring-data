package ru.itsjava;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.repository.FilmRepository;

import java.sql.SQLException;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) throws SQLException {
        var context = SpringApplication.run(MyApp.class, args);

        FilmRepository filmRepository = context.getBean(FilmRepository.class);


        Console.main(args);


    }
}
