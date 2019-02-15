package cn.liuxingwei.judge.mapper;

import cn.liuxingwei.judge.domain.Compileinfo;
import java.util.List;

public interface CompileinfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compileinfo
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer solutionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compileinfo
	 * @mbg.generated
	 */
	int insert(Compileinfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compileinfo
	 * @mbg.generated
	 */
	Compileinfo selectByPrimaryKey(Integer solutionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compileinfo
	 * @mbg.generated
	 */
	List<Compileinfo> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compileinfo
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Compileinfo record);
}