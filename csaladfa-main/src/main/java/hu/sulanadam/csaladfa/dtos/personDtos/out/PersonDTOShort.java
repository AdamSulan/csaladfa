package hu.sulanadam.csaladfa.dtos.personDtos.out;

import java.time.LocalDate;
public record PersonDTOShort(Long id, String name, boolean sex, LocalDate birthDate, String birthLocation, Long motherId, String motherName, Long fatherId, String fatherName, LocalDate deathDate, String deathLocation) {}
