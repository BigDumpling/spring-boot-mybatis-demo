package com.ligq.study.mybatis.demo.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ligq.study.mybatis.demo.model.Pet;
import com.ligq.study.mybatis.demo.service.PetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/pet")
public class PetRest {

    private PetService petService;

    public PetRest(PetService petService) {
        this.petService = petService;
    }

    @GetMapping(path = "/list")
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public List<Pet> getPet() throws JsonProcessingException {
        List<Pet> list1 = petService.selectAllPets();
        Pet pet = new Pet();
        pet.setName("大公鸡");
        pet.setSex("1");
        pet.setOwner("小强");
        pet.setCreateTime(LocalDateTime.now());
        pet.setCreateTimestamp(LocalDateTime.now());
        int insert = petService.insertSelective(pet);

        pet.setBirth(LocalDate.now());
        Example example = new Example(Pet.class);
        example.createCriteria()
                .andEqualTo("id", pet.getId())
                .andEqualTo("sex", "0");
        int update1 = petService.updateByParam(pet, example);

        List<Pet> list2 = petService.selectAllPets();
        log.info("list2.size() == {}", list2.size());
        return list2;
    }
}
