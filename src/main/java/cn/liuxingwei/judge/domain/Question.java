package cn.liuxingwei.judge.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table question
 */
public class Question {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column question.question_id
	 * @mbg.generated
	 */
	private Integer questionId;
	/**
	 * Database Column Remarks: 科目id This field was generated by MyBatis Generator. This field corresponds to the database column question.category_id
	 * @mbg.generated
	 */
	private Integer categoryId;
	/**
	 * Database Column Remarks: 试卷标题 This field was generated by MyBatis Generator. This field corresponds to the database column question.title
	 * @mbg.generated
	 */
	private String title;
	/**
	 * Database Column Remarks: 试题状态 This field was generated by MyBatis Generator. This field corresponds to the database column question.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * Database Column Remarks: 作者id This field was generated by MyBatis Generator. This field corresponds to the database column question.user_id
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * Database Column Remarks: 发布时间 This field was generated by MyBatis Generator. This field corresponds to the database column question.post_time
	 * @mbg.generated
	 */
	private Date postTime;
	/**
	 * Database Column Remarks: 选择题数量 This field was generated by MyBatis Generator. This field corresponds to the database column question.choice_number
	 * @mbg.generated
	 */
	private Integer choiceNumber;
	/**
	 * Database Column Remarks: 选择题分数 This field was generated by MyBatis Generator. This field corresponds to the database column question.choice_total
	 * @mbg.generated
	 */
	private Integer choiceTotal;
	/**
	 * Database Column Remarks: 问答题数量 This field was generated by MyBatis Generator. This field corresponds to the database column question.qa_number
	 * @mbg.generated
	 */
	private Integer qaNumber;
	/**
	 * Database Column Remarks: 问答题分数 This field was generated by MyBatis Generator. This field corresponds to the database column question.qa_total
	 * @mbg.generated
	 */
	private Integer qaTotal;
	/**
	 * Database Column Remarks: 总分 This field was generated by MyBatis Generator. This field corresponds to the database column question.total
	 * @mbg.generated
	 */
	private Integer total;
	/**
	 * Database Column Remarks: 试卷内容 This field was generated by MyBatis Generator. This field corresponds to the database column question.content
	 * @mbg.generated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.question_id
	 * @return  the value of question.question_id
	 * @mbg.generated
	 */
	public Integer getQuestionId() {
		return questionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.question_id
	 * @param questionId  the value for question.question_id
	 * @mbg.generated
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.category_id
	 * @return  the value of question.category_id
	 * @mbg.generated
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.category_id
	 * @param categoryId  the value for question.category_id
	 * @mbg.generated
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.title
	 * @return  the value of question.title
	 * @mbg.generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.title
	 * @param title  the value for question.title
	 * @mbg.generated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.status
	 * @return  the value of question.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.status
	 * @param status  the value for question.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.user_id
	 * @return  the value of question.user_id
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.user_id
	 * @param userId  the value for question.user_id
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.post_time
	 * @return  the value of question.post_time
	 * @mbg.generated
	 */
	public Date getPostTime() {
		return postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.post_time
	 * @param postTime  the value for question.post_time
	 * @mbg.generated
	 */
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.choice_number
	 * @return  the value of question.choice_number
	 * @mbg.generated
	 */
	public Integer getChoiceNumber() {
		return choiceNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.choice_number
	 * @param choiceNumber  the value for question.choice_number
	 * @mbg.generated
	 */
	public void setChoiceNumber(Integer choiceNumber) {
		this.choiceNumber = choiceNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.choice_total
	 * @return  the value of question.choice_total
	 * @mbg.generated
	 */
	public Integer getChoiceTotal() {
		return choiceTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.choice_total
	 * @param choiceTotal  the value for question.choice_total
	 * @mbg.generated
	 */
	public void setChoiceTotal(Integer choiceTotal) {
		this.choiceTotal = choiceTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.qa_number
	 * @return  the value of question.qa_number
	 * @mbg.generated
	 */
	public Integer getQaNumber() {
		return qaNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.qa_number
	 * @param qaNumber  the value for question.qa_number
	 * @mbg.generated
	 */
	public void setQaNumber(Integer qaNumber) {
		this.qaNumber = qaNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.qa_total
	 * @return  the value of question.qa_total
	 * @mbg.generated
	 */
	public Integer getQaTotal() {
		return qaTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.qa_total
	 * @param qaTotal  the value for question.qa_total
	 * @mbg.generated
	 */
	public void setQaTotal(Integer qaTotal) {
		this.qaTotal = qaTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.total
	 * @return  the value of question.total
	 * @mbg.generated
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.total
	 * @param total  the value for question.total
	 * @mbg.generated
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column question.content
	 * @return  the value of question.content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column question.content
	 * @param content  the value for question.content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}