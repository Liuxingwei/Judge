package cn.liuxingwei.judge.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table exam
 */
public class Exam {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column exam.exam_id
	 * @mbg.generated
	 */
	private Integer examId;
	/**
	 * Database Column Remarks: 科目id This field was generated by MyBatis Generator. This field corresponds to the database column exam.category_id
	 * @mbg.generated
	 */
	private Integer categoryId;
	/**
	 * Database Column Remarks: 考试标题 This field was generated by MyBatis Generator. This field corresponds to the database column exam.title
	 * @mbg.generated
	 */
	private String title;
	/**
	 * Database Column Remarks: 考试状态 This field was generated by MyBatis Generator. This field corresponds to the database column exam.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * Database Column Remarks: 作者id This field was generated by MyBatis Generator. This field corresponds to the database column exam.user_id
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * Database Column Remarks: 发布时间 This field was generated by MyBatis Generator. This field corresponds to the database column exam.post_time
	 * @mbg.generated
	 */
	private Date postTime;
	/**
	 * Database Column Remarks: 选择题数量 This field was generated by MyBatis Generator. This field corresponds to the database column exam.choice_number
	 * @mbg.generated
	 */
	private Integer choiceNumber;
	/**
	 * Database Column Remarks: 选择题分数 This field was generated by MyBatis Generator. This field corresponds to the database column exam.choice_total
	 * @mbg.generated
	 */
	private Integer choiceTotal;
	/**
	 * Database Column Remarks: 问答题数量 This field was generated by MyBatis Generator. This field corresponds to the database column exam.qa_number
	 * @mbg.generated
	 */
	private Integer qaNumber;
	/**
	 * Database Column Remarks: 问答题分数 This field was generated by MyBatis Generator. This field corresponds to the database column exam.qa_total
	 * @mbg.generated
	 */
	private Integer qaTotal;
	/**
	 * Database Column Remarks: 总分 This field was generated by MyBatis Generator. This field corresponds to the database column exam.total
	 * @mbg.generated
	 */
	private Integer total;
	/**
	 * Database Column Remarks: 考试开始时间 This field was generated by MyBatis Generator. This field corresponds to the database column exam.start_time
	 * @mbg.generated
	 */
	private Date startTime;
	/**
	 * Database Column Remarks: 考试结束时间 This field was generated by MyBatis Generator. This field corresponds to the database column exam.end_time
	 * @mbg.generated
	 */
	private Date endTime;
	/**
	 * Database Column Remarks: 考试密码 This field was generated by MyBatis Generator. This field corresponds to the database column exam.secret
	 * @mbg.generated
	 */
	private String secret;
	/**
	 * Database Column Remarks: 考试类型，0为公开，1为私有 This field was generated by MyBatis Generator. This field corresponds to the database column exam.type
	 * @mbg.generated
	 */
	private Byte type;
	/**
	 * Database Column Remarks: 试卷id This field was generated by MyBatis Generator. This field corresponds to the database column exam.question_id
	 * @mbg.generated
	 */
	private Integer questionId;
	/**
	 * Database Column Remarks: 试卷标题 This field was generated by MyBatis Generator. This field corresponds to the database column exam.question_title
	 * @mbg.generated
	 */
	private String questionTitle;
	/**
	 * Database Column Remarks: 考试内容 This field was generated by MyBatis Generator. This field corresponds to the database column exam.content
	 * @mbg.generated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.exam_id
	 * @return  the value of exam.exam_id
	 * @mbg.generated
	 */
	public Integer getExamId() {
		return examId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.exam_id
	 * @param examId  the value for exam.exam_id
	 * @mbg.generated
	 */
	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.category_id
	 * @return  the value of exam.category_id
	 * @mbg.generated
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.category_id
	 * @param categoryId  the value for exam.category_id
	 * @mbg.generated
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.title
	 * @return  the value of exam.title
	 * @mbg.generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.title
	 * @param title  the value for exam.title
	 * @mbg.generated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.status
	 * @return  the value of exam.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.status
	 * @param status  the value for exam.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.user_id
	 * @return  the value of exam.user_id
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.user_id
	 * @param userId  the value for exam.user_id
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.post_time
	 * @return  the value of exam.post_time
	 * @mbg.generated
	 */
	public Date getPostTime() {
		return postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.post_time
	 * @param postTime  the value for exam.post_time
	 * @mbg.generated
	 */
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.choice_number
	 * @return  the value of exam.choice_number
	 * @mbg.generated
	 */
	public Integer getChoiceNumber() {
		return choiceNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.choice_number
	 * @param choiceNumber  the value for exam.choice_number
	 * @mbg.generated
	 */
	public void setChoiceNumber(Integer choiceNumber) {
		this.choiceNumber = choiceNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.choice_total
	 * @return  the value of exam.choice_total
	 * @mbg.generated
	 */
	public Integer getChoiceTotal() {
		return choiceTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.choice_total
	 * @param choiceTotal  the value for exam.choice_total
	 * @mbg.generated
	 */
	public void setChoiceTotal(Integer choiceTotal) {
		this.choiceTotal = choiceTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.qa_number
	 * @return  the value of exam.qa_number
	 * @mbg.generated
	 */
	public Integer getQaNumber() {
		return qaNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.qa_number
	 * @param qaNumber  the value for exam.qa_number
	 * @mbg.generated
	 */
	public void setQaNumber(Integer qaNumber) {
		this.qaNumber = qaNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.qa_total
	 * @return  the value of exam.qa_total
	 * @mbg.generated
	 */
	public Integer getQaTotal() {
		return qaTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.qa_total
	 * @param qaTotal  the value for exam.qa_total
	 * @mbg.generated
	 */
	public void setQaTotal(Integer qaTotal) {
		this.qaTotal = qaTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.total
	 * @return  the value of exam.total
	 * @mbg.generated
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.total
	 * @param total  the value for exam.total
	 * @mbg.generated
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.start_time
	 * @return  the value of exam.start_time
	 * @mbg.generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.start_time
	 * @param startTime  the value for exam.start_time
	 * @mbg.generated
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.end_time
	 * @return  the value of exam.end_time
	 * @mbg.generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.end_time
	 * @param endTime  the value for exam.end_time
	 * @mbg.generated
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.secret
	 * @return  the value of exam.secret
	 * @mbg.generated
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.secret
	 * @param secret  the value for exam.secret
	 * @mbg.generated
	 */
	public void setSecret(String secret) {
		this.secret = secret == null ? null : secret.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.type
	 * @return  the value of exam.type
	 * @mbg.generated
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.type
	 * @param type  the value for exam.type
	 * @mbg.generated
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.question_id
	 * @return  the value of exam.question_id
	 * @mbg.generated
	 */
	public Integer getQuestionId() {
		return questionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.question_id
	 * @param questionId  the value for exam.question_id
	 * @mbg.generated
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.question_title
	 * @return  the value of exam.question_title
	 * @mbg.generated
	 */
	public String getQuestionTitle() {
		return questionTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.question_title
	 * @param questionTitle  the value for exam.question_title
	 * @mbg.generated
	 */
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle == null ? null : questionTitle.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column exam.content
	 * @return  the value of exam.content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column exam.content
	 * @param content  the value for exam.content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}