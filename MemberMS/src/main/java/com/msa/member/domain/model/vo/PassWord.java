package com.msa.member.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassWord {

    private String presentPWD;
    private String pastPWD;

    public static PassWord sample(){
        return new PassWord("12345", "abcde");
    }
}
