package com.biz.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biz.shop.domain.ProductVO;

/*
 * hibernation에서 기본적으로 제공하는 CRUD를 사용하기 위해서
 * JpaRepository를 상속받는데
 * <사용할 VO, PK의 Type>을 Generic으로 지정한다.
 * 
 * PK type에서 primitive 형식으로 지정하지 말고
 * wrapper class 형식으로 지정하자.
 * 
 * ================================
 * primitive		wrapper class
 * =================================
 * int				Integer
 * float			Float
 * long				Long
 * double			Double
 * char				Character
 * 문자열			String
 * boolean			Boolean 
 * ================================
 * 
 * 참조형 변수
 * 어떤 method에 매개변수로 보내고 값이 변동되엇을 때
 * 원래 값 변동ㄷ
 */
public interface ProductDao extends JpaRepository<ProductVO, Long>{

	
	
}
