package com.mop.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mop.Entity.ProductPojo;
@Repository
public interface ProductRepo extends JpaRepository<ProductPojo, Integer> {

	public abstract List<ProductPojo> getByPname(String pname);
}
