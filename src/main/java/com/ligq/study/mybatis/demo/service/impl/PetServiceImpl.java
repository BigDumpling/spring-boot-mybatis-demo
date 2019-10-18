package com.ligq.study.mybatis.demo.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.mybatis.demo.dao.PetMapper;
import com.ligq.study.mybatis.demo.model.Pet;
import com.ligq.study.mybatis.demo.service.PetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Slf4j
@Service("petService")
public class PetServiceImpl implements PetService {

    private ObjectMapper objectMapper;
    private PetMapper petMapper;

    public PetServiceImpl(ObjectMapper objectMapper,
                          PetMapper petMapper) {
        this.objectMapper = objectMapper;
        this.petMapper = petMapper;
    }

    @Override
    public List<Pet> selectAllPets() throws JsonProcessingException {
        List<Pet> result = petMapper.selectAll();
        log.info("selectAllPets result == {}", objectMapper.writeValueAsString(result));
        return result;
    }

    @Override
    public Pet selectById(long id) throws JsonProcessingException {
        Pet pet = petMapper.selectByPrimaryKey(id);
        log.info("selectById result == {}", objectMapper.writeValueAsString(pet));
        return pet;
    }

    @Override
    public int updatePrimaryKeySelective(Pet pet) {
        int i = petMapper.updateByPrimaryKeySelective(pet);
        log.info("updatePrimaryKeySelective result == {}", i);
        return i;
    }

    @Override
    public int updateByParam(Pet pet, Example cond) {
        int i = petMapper.updateByExampleSelective(pet, cond);
        log.info("updateByParam result == {}", i);
        return i;
    }

    @Override
    public int insertSelective(Pet pet) {
        int i = petMapper.insertUseGeneratedKeys(pet);
        log.info("insertSelective result == {}", i);
        return i;
    }
}
