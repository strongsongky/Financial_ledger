package com.money.mapper;

import com.money.domain.UsersDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

    public UsersDTO getUserByEmail(String email);
    public int insertUser(UsersDTO user);
    public UsersDTO loginCheck(String email, String password);
    public int registerUser(UsersDTO user);
    public int checkDuplicateEmail(String email);
}


