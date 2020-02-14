package com.biz.rbooks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookVO {

	private String b_code; //	varchar2(20)		primary key, --도서코드
	private String b_name; //	nvarchar2(125)	not null	, -- 도서명
	private String b_auther; //	nvarchar2(125)	not null,	--저자
	private String b_comp; //	nvarchar2(125)		, --출판사
	private String b_year; //	varchar2(10)		,--구입일자
	private int b_iprice; //	number		--구입가격
	
}
