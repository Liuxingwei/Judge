package cn.liuxingwei.judge.mapper;

import cn.liuxingwei.judge.domain.Custominput;
import java.util.List;

public interface CustominputMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custominput
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer solutionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custominput
	 * @mbg.generated
	 */
	int insert(Custominput record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custominput
	 * @mbg.generated
	 */
	Custominput selectByPrimaryKey(Integer solutionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custominput
	 * @mbg.generated
	 */
	List<Custominput> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custominput
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Custominput record);
}