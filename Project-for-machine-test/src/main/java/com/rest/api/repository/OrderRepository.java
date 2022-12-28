package com.rest.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.api.entity.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

	
//	@Query("select i.name from Items i inner join i.unitPrice ar where ar.id = id")
//	
//	public List<Order> FindAllWithDescriptionQuery(Integer id);
}

