package com.ligq.study.mybatis.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ligq.study.mybatis.demo.model.Pet;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface PetService {

    List<Pet> selectAllPets() throws JsonProcessingException;

    Pet selectById(long id) throws JsonProcessingException;

    int updatePrimaryKeySelective(Pet pet);

    int updateByParam(Pet pet, Example cond);

    int insertSelective(Pet pet);
}
