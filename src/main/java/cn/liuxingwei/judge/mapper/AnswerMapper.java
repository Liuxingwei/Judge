package cn.liuxingwei.judge.mapper;

import cn.liuxingwei.judge.domain.Answer;
import java.util.List;

public interface AnswerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer answerId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated
	 */
	int insert(Answer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated
	 */
	Answer selectByPrimaryKey(Integer answerId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated
	 */
	List<Answer> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Answer record);
}