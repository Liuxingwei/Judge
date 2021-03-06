package cn.liuxingwei.judge.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table answer
 */
public class Answer {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column answer.answer_id
	 * @mbg.generated
	 */
	private Integer answerId;
	/**
	 * Database Column Remarks: 考试id This field was generated by MyBatis Generator. This field corresponds to the database column answer.exam_id
	 * @mbg.generated
	 */
	private Integer examId;
	/**
	 * Database Column Remarks: 选择题分数 This field was generated by MyBatis Generator. This field corresponds to the database column answer.choice_total
	 * @mbg.generated
	 */
	private Integer choiceTotal;
	/**
	 * Database Column Remarks: 问答题分数 This field was generated by MyBatis Generator. This field corresponds to the database column answer.qa_total
	 * @mbg.generated
	 */
	private Integer qaTotal;
	/**
	 * Database Column Remarks: 总分 This field was generated by MyBatis Generator. This field corresponds to the database column answer.total
	 * @mbg.generated
	 */
	private Integer total;
	/**
	 * Database Column Remarks: 作者id This field was generated by MyBatis Generator. This field corresponds to the database column answer.user_id
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * Database Column Remarks: 发布时间 This field was generated by MyBatis Generator. This field corresponds to the database column answer.post_time
	 * @mbg.generated
	 */
	private Date postTime;
	/**
	 * Database Column Remarks: 考试内容 This field was generated by MyBatis Generator. This field corresponds to the database column answer.content
	 * @mbg.generated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.answer_id
	 * @return  the value of answer.answer_id
	 * @mbg.generated
	 */
	public Integer getAnswerId() {
		return answerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.answer_id
	 * @param answerId  the value for answer.answer_id
	 * @mbg.generated
	 */
	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.exam_id
	 * @return  the value of answer.exam_id
	 * @mbg.generated
	 */
	public Integer getExamId() {
		return examId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.exam_id
	 * @param examId  the value for answer.exam_id
	 * @mbg.generated
	 */
	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.choice_total
	 * @return  the value of answer.choice_total
	 * @mbg.generated
	 */
	public Integer getChoiceTotal() {
		return choiceTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.choice_total
	 * @param choiceTotal  the value for answer.choice_total
	 * @mbg.generated
	 */
	public void setChoiceTotal(Integer choiceTotal) {
		this.choiceTotal = choiceTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.qa_total
	 * @return  the value of answer.qa_total
	 * @mbg.generated
	 */
	public Integer getQaTotal() {
		return qaTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.qa_total
	 * @param qaTotal  the value for answer.qa_total
	 * @mbg.generated
	 */
	public void setQaTotal(Integer qaTotal) {
		this.qaTotal = qaTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.total
	 * @return  the value of answer.total
	 * @mbg.generated
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.total
	 * @param total  the value for answer.total
	 * @mbg.generated
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.user_id
	 * @return  the value of answer.user_id
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.user_id
	 * @param userId  the value for answer.user_id
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.post_time
	 * @return  the value of answer.post_time
	 * @mbg.generated
	 */
	public Date getPostTime() {
		return postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.post_time
	 * @param postTime  the value for answer.post_time
	 * @mbg.generated
	 */
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.content
	 * @return  the value of answer.content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.content
	 * @param content  the value for answer.content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}