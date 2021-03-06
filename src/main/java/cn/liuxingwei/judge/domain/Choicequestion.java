package cn.liuxingwei.judge.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table choice_question
 */
public class Choicequestion {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.choice_question_id
	 * @mbg.generated
	 */
	private Integer choiceQuestionId;
	/**
	 * Database Column Remarks: 科目 This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.category_id
	 * @mbg.generated
	 */
	private Integer categoryId;
	/**
	 * Database Column Remarks: 正确答案 This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.answer
	 * @mbg.generated
	 */
	private String answer;
	/**
	 * Database Column Remarks: 参考分值 This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.score
	 * @mbg.generated
	 */
	private Integer score;
	/**
	 * Database Column Remarks: 添加者用户id This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.user_id
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * Database Column Remarks: 添加时间 This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.post_time
	 * @mbg.generated
	 */
	private Date postTime;
	/**
	 * Database Column Remarks: 状态 This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * Database Column Remarks: 题目 This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.subject
	 * @mbg.generated
	 */
	private String subject;
	/**
	 * Database Column Remarks: 可选答案，json序列化存储 This field was generated by MyBatis Generator. This field corresponds to the database column choice_question.options
	 * @mbg.generated
	 */
	private String options;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.choice_question_id
	 * @return  the value of choice_question.choice_question_id
	 * @mbg.generated
	 */
	public Integer getChoiceQuestionId() {
		return choiceQuestionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.choice_question_id
	 * @param choiceQuestionId  the value for choice_question.choice_question_id
	 * @mbg.generated
	 */
	public void setChoiceQuestionId(Integer choiceQuestionId) {
		this.choiceQuestionId = choiceQuestionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.category_id
	 * @return  the value of choice_question.category_id
	 * @mbg.generated
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.category_id
	 * @param categoryId  the value for choice_question.category_id
	 * @mbg.generated
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.answer
	 * @return  the value of choice_question.answer
	 * @mbg.generated
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.answer
	 * @param answer  the value for choice_question.answer
	 * @mbg.generated
	 */
	public void setAnswer(String answer) {
		this.answer = answer == null ? null : answer.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.score
	 * @return  the value of choice_question.score
	 * @mbg.generated
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.score
	 * @param score  the value for choice_question.score
	 * @mbg.generated
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.user_id
	 * @return  the value of choice_question.user_id
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.user_id
	 * @param userId  the value for choice_question.user_id
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.post_time
	 * @return  the value of choice_question.post_time
	 * @mbg.generated
	 */
	public Date getPostTime() {
		return postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.post_time
	 * @param postTime  the value for choice_question.post_time
	 * @mbg.generated
	 */
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.status
	 * @return  the value of choice_question.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.status
	 * @param status  the value for choice_question.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.subject
	 * @return  the value of choice_question.subject
	 * @mbg.generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.subject
	 * @param subject  the value for choice_question.subject
	 * @mbg.generated
	 */
	public void setSubject(String subject) {
		this.subject = subject == null ? null : subject.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column choice_question.options
	 * @return  the value of choice_question.options
	 * @mbg.generated
	 */
	public String getOptions() {
		return options;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column choice_question.options
	 * @param options  the value for choice_question.options
	 * @mbg.generated
	 */
	public void setOptions(String options) {
		this.options = options == null ? null : options.trim();
	}
}