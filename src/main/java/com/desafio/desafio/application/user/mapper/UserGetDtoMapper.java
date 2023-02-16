package com.desafio.desafio.application.user.mapper;

import com.desafio.desafio.application.user.UserGetDto;
import com.desafio.desafio.domain.user.UserGitHub;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import org.hibernate.internal.util.ZonedDateTimeComparator;
import org.json.*;

import org.modelmapper.ModelMapper;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
@AllArgsConstructor
public class UserGetDtoMapper {

    private final Gson gson;

    private final ModelMapper mapper;
    public UserGetDto toUserGetDto(String body){

        UserGetDto userGetDto = gson.fromJson(body, UserGetDto.class);
        JSONObject jsonArray = new JSONObject(body);
        String createdAtString = jsonArray.getString("created_at");
        String updatedAtString = jsonArray.getString("updated_at");
        ZonedDateTime createdAtZoneDate = ZonedDateTime.parse(createdAtString);
        ZonedDateTime updatedZoneDate = ZonedDateTime.parse(updatedAtString);
        userGetDto.setCreatedAt(createdAtZoneDate.toLocalDateTime());
        userGetDto.setUpdatedAt(updatedZoneDate.toLocalDateTime());
        return userGetDto;
    }

    public UserGitHub toUser(UserGetDto dto){
       return mapper.map(dto, UserGitHub.class);
    }
}
