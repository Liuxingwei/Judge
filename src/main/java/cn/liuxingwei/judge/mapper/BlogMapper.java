package cn.liuxingwei.judge.mapper;

import cn.liuxingwei.judge.domain.Blog;
import java.util.List;

public interface BlogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blog
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer blogId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blog
	 * @mbg.generated
	 */
	int insert(Blog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blog
	 * @mbg.generated
	 */
	Blog selectByPrimaryKey(Integer blogId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blog
	 * @mbg.generated
	 */
	List<Blog> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blog
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Blog record);
}