package com.ewallet.user.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {

    private String fullName;

    private String userName;

    private String phoneNumber;

    private String email;

    private String password;

    private String birthDate;

    private String address;

    private String nidNumber;

    private String gender;

    private String role;

    private String photoUrl;

    private String nidPhotoUrl;
}
