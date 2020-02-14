package com.biz.rbooks.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.biz.rbooks.domain.BookVO;


//mapper-context.xml을 따로 만들 경우에는
// DB에서 필요한거 가져와서 mapper를 만들고
// mapper-context.xml 쌤 git에서 가져와서 붙여넣기
public interface BookDao {

	// Read
	@Select("SELECT * FROM tbl_books")
	public List<BookVO> selectAll();
	
	// Create
	@Insert("INSERT INTO tbl_books(B_CODE," + 
			"B_NAME," + 
			"B_AUTHER," + 
			"B_COMP," + 
			"B_YEAR," + 
			"B_IPRICE)" + 
			"VALUES"+
			"(#{b_code},"+
			"#{b_name}," + 
			"#{b_auther}," + 
			"#{b_comp}," + 
			"#{b_year}," + 
			"#{b_iprice})")
	public int insert(BookVO bookVO);
	
	// Update
	@Update("UPDATE tbl_books "+
			"SET " + 
			"B_NAME = #{b_name}," + 
			"B_AUTHER = #{b_auther}," + 
			"B_COMP = #{b_comp}," + 
			"B_YEAR = #{b_year}," + 
			"B_IPRICE = #{b_iprice}"
			+ "  WHERE B_CODE = #{b_code}")
	public int update(BookVO bookVO);
	// @Param annotation은 매개변수가 2개 이상일 때는 꼭 붙여야 한다
	
	// Delete
	@Delete("DELETE FROM tbl_books WHERE B_CODE = #{b_code}")
	public int delete(String b_code);

	
	@Select("SELECT * FROM tbl_books WHERE B_CODE = #{b_code}")
	public BookVO findById(String b_code);
	
	
}


