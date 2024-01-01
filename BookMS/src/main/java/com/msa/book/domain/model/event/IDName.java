package com.msa.book.domain.model.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class IDName {

    private String id;
    private String name;

    public static IDName sample(){
        return new IDName("scant", "han");
    }

    public static void main(String[] args) {
        System.out.println(sample());
    }

}
