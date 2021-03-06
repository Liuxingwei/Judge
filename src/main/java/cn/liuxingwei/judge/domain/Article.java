package cn.liuxingwei.judge.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table article
 */
public class Article {

	/**
	 * Database Column Remarks: 主键 This field was generated by MyBatis Generator. This field corresponds to the database column article.article_id
	 * @mbg.generated
	 */
	private Integer articleId;
	/**
	 * Database Column Remarks: 科目id This field was generated by MyBatis Generator. This field corresponds to the database column article.category_id
	 * @mbg.generated
	 */
	private Integer categoryId;
	/**
	 * Database Column Remarks: 标题 This field was generated by MyBatis Generator. This field corresponds to the database column article.title
	 * @mbg.generated
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.user_id
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.post_time
	 * @mbg.generated
	 */
	private Date postTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.nice
	 * @mbg.generated
	 */
	private Integer nice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.scan
	 * @mbg.generated
	 */
	private Integer scan;
	/**
	 * Database Column Remarks: 文章内容 This field was generated by MyBatis Generator. This field corresponds to the database column article.content
	 * @mbg.generated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.article_id
	 * @return  the value of article.article_id
	 * @mbg.generated
	 */
	public Integer getArticleId() {
		return articleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.article_id
	 * @param articleId  the value for article.article_id
	 * @mbg.generated
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.category_id
	 * @return  the value of article.category_id
	 * @mbg.generated
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.category_id
	 * @param categoryId  the value for article.category_id
	 * @mbg.generated
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.title
	 * @return  the value of article.title
	 * @mbg.generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.title
	 * @param title  the value for article.title
	 * @mbg.generated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.user_id
	 * @return  the value of article.user_id
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.user_id
	 * @param userId  the value for article.user_id
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.post_time
	 * @return  the value of article.post_time
	 * @mbg.generated
	 */
	public Date getPostTime() {
		return postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.post_time
	 * @param postTime  the value for article.post_time
	 * @mbg.generated
	 */
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.status
	 * @return  the value of article.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.status
	 * @param status  the value for article.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.nice
	 * @return  the value of article.nice
	 * @mbg.generated
	 */
	public Integer getNice() {
		return nice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.nice
	 * @param nice  the value for article.nice
	 * @mbg.generated
	 */
	public void setNice(Integer nice) {
		this.nice = nice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.scan
	 * @return  the value of article.scan
	 * @mbg.generated
	 */
	public Integer getScan() {
		return scan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.scan
	 * @param scan  the value for article.scan
	 * @mbg.generated
	 */
	public void setScan(Integer scan) {
		this.scan = scan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.content
	 * @return  the value of article.content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.content
	 * @param content  the value for article.content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}