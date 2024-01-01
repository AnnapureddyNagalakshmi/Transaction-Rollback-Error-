package com.DbJpa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DbJpa.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Serializable>{

}
