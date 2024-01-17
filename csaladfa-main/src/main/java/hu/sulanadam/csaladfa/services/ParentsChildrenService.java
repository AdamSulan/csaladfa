package hu.sulanadam.csaladfa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hu.sulanadam.csaladfa.repositories.ParentsChildrenRepository;
import hu.sulanadam.csaladfa.dtos.personDtos.out.PersonDTOIdName;
import hu.sulanadam.csaladfa.dtos.personDtos.out.PersonDTOIdNameSex;


@Service
public class ParentsChildrenService {

    ParentsChildrenRepository parentsChildrenRepository;

    public ParentsChildrenService(ParentsChildrenRepository parentsChildrenRepository) {
        this.parentsChildrenRepository = parentsChildrenRepository;
    }
    public List<PersonDTOIdNameSex> getParentsSexByChildId(Long childId){
        return parentsChildrenRepository.getParentsSexByChildId(childId);
    }

    public List<PersonDTOIdName> getChildrenByParentId(Long parentId){
        return parentsChildrenRepository.getChildrenByParentId(parentId);
    }

}
