package cn.liuxingwei.judge.mapper;

import cn.liuxingwei.judge.domain.News;
import java.util.List;

public interface NewsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer newsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated
	 */
	int insert(News record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated
	 */
	News selectByPrimaryKey(Integer newsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated
	 */
	List<News> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated
	 */
	int updateByPrimaryKey(News record);
}