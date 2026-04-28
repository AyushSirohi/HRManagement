package com.cg.hrdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cg.hrdatabase.entity.Region;

@RepositoryRestResource
public interface RegionRepository extends JpaRepository<Region, Long> {
}