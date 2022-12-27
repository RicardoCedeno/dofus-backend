package com.dofus.dofusbackend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer idClass;

    @Getter
    @Setter
    private String nameClass;

    @Getter
    @Setter
    private String sentenceClass;

    @Getter
    @Setter
    private String representationClass;

    @Getter
    @Setter
    private String aboutClass;

    @Getter
    @Setter
    private String image1Class;

    @Getter
    @Setter
    private String image2Class;

    @Getter
    @Setter
    private String image3Class;

    @Getter
    @Setter
    private String image4Class;

    @Getter
    @Setter
    private String logoClass;

    @Getter
    @Setter
    private String videoClass;
}
