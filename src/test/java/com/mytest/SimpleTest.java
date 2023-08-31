package com.mytest;

import com.mytest.springboot.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SimpleTest {

    @Test
    public void testNull() {
        UserDto userDto = new UserDto();
        if (new Integer(1).equals(userDto.getAges())) {
            System.out.println("succ");
        }
        else {
            System.out.println("error");
        }
    }
}
