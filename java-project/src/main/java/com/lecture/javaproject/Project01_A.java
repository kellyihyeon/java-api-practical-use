package com.lecture.javaproject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lecture.javaproject.dto.BookDto;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Project01_A {

    public static void main(String[] args) {
        //Object(BookDTO) -> JSON(String)
        BookDto bookDto = new BookDto("자바", 21000, "에이콘", 670);

        Gson gson = new Gson();
        String json = gson.toJson(bookDto);

        System.out.println("json = " + json);
        //json = {"title":"자바","price":21000,"company":"에이콘","page":670}


        //JSON(String) -> Object(BookDTO)
        BookDto bookDto2 = gson.fromJson(json, BookDto.class);
        System.out.println("bookDto2 = " + bookDto2);
        System.out.println("bookDto2.getTitle() = " + bookDto2.getTitle());
        System.out.println("bookDto2.getPrice() = " + bookDto2.getPrice());

        //Object(List<BookDto> - > JSON(String) : [{ },{ },{ }...]
        List<BookDto> list = new ArrayList<>();
        list.add(new BookDto("자바1", 21000, "에이콘1", 570));
        list.add(new BookDto("자바2", 31000, "에이콘2", 670));
        list.add(new BookDto("자바3", 11000, "에이콘3", 370));

        String listJson = gson.toJson(list);
        System.out.println("listJson = " + listJson);

        //JSON(String) : [{ },{ },{ }...] - > Object(List<BookDto>
        List<BookDto> list2 = gson.fromJson(listJson, new TypeToken<List<BookDto>>(){}.getType());
        for (BookDto dto : list2) {
            System.out.println(dto);
        }

    }
}
