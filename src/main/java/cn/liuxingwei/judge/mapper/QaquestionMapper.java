package cn.liuxingwei.judge.mapper;

import cn.liuxingwei.judge.domain.Qaquestion;
import java.util.List;

public interface QaquestionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table qa_question
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer qaQuestionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table qa_question
	 * @mbg.generated
	 */
	int insert(Qaquestion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table qa_question
	 * @mbg.generated
	 */
	Qaquestion selectByPrimaryKey(Integer qaQuestionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table qa_question
	 * @mbg.generated
	 */
	List<Qaquestion> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table qa_question
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Qaquestion record);
}