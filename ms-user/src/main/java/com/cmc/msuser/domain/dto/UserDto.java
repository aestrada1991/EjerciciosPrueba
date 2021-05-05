package com.cmc.msuser.domain.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Immutable;


import java.util.Date;


@Getter
@Setter
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
        "fullName",
        "phoneContact",
        "email",
        "surname",
        "userCode",
        "lastAuthenticationDate",
        "lastAuthenticationHour",
        "numberTest",

})

public class UserDto {

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("phoneContact")
    private String phoneContact;

    @JsonProperty("email")
    private String email;

    @JsonProperty("userCode")
    private Integer userCode;

    @JsonProperty("lastAuthenticationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-CO", timezone = "America/Bogota")
    private Date lastAuthenticationDate;

    @JsonProperty("lastAuthenticationHour")
    private String lastAuthenticationHour;

    @JsonProperty("numberTest")
    private Integer numberTest;


}


