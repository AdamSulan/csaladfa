package hu.sulanadam.csaladfa.dtos.personDtos.out;

import java.time.LocalDate;
import java.util.List;
public record PersonDTOBasic(Long id, String name, boolean sex, LocalDate birthDate, String birthLocation, Long motherId, String motherName, Long fatherId, String fatherName, LocalDate deathDate, String deathLocation, List<PersonDTOIdName> children) {}
