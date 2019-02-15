package cn.liuxingwei.judge.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pdf
 */
public class Pdf {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pdf.pdf_id
	 * @mbg.generated
	 */
	private Integer pdfId;
	/**
	 * Database Column Remarks: 科目 This field was generated by MyBatis Generator. This field corresponds to the database column pdf.category_id
	 * @mbg.generated
	 */
	private Integer categoryId;
	/**
	 * Database Column Remarks: 标题 This field was generated by MyBatis Generator. This field corresponds to the database column pdf.title
	 * @mbg.generated
	 */
	private String title;
	/**
	 * Database Column Remarks: pdf文件链接 This field was generated by MyBatis Generator. This field corresponds to the database column pdf.url
	 * @mbg.generated
	 */
	private String url;
	/**
	 * Database Column Remarks: 视频描述 This field was generated by MyBatis Generator. This field corresponds to the database column pdf.desc
	 * @mbg.generated
	 */
	private String desc;
	/**
	 * Database Column Remarks: 创建/编辑者id This field was generated by MyBatis Generator. This field corresponds to the database column pdf.user_id
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * Database Column Remarks: 发布/修改时间 This field was generated by MyBatis Generator. This field corresponds to the database column pdf.post_time
	 * @mbg.generated
	 */
	private Date postTime;
	/**
	 * Database Column Remarks: 状态：1为正常 This field was generated by MyBatis Generator. This field corresponds to the database column pdf.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pdf.nice
	 * @mbg.generated
	 */
	private Integer nice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pdf.scan
	 * @mbg.generated
	 */
	private Integer scan;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.pdf_id
	 * @return  the value of pdf.pdf_id
	 * @mbg.generated
	 */
	public Integer getPdfId() {
		return pdfId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.pdf_id
	 * @param pdfId  the value for pdf.pdf_id
	 * @mbg.generated
	 */
	public void setPdfId(Integer pdfId) {
		this.pdfId = pdfId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.category_id
	 * @return  the value of pdf.category_id
	 * @mbg.generated
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.category_id
	 * @param categoryId  the value for pdf.category_id
	 * @mbg.generated
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.title
	 * @return  the value of pdf.title
	 * @mbg.generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.title
	 * @param title  the value for pdf.title
	 * @mbg.generated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.url
	 * @return  the value of pdf.url
	 * @mbg.generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.url
	 * @param url  the value for pdf.url
	 * @mbg.generated
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.desc
	 * @return  the value of pdf.desc
	 * @mbg.generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.desc
	 * @param desc  the value for pdf.desc
	 * @mbg.generated
	 */
	public void setDesc(String desc) {
		this.desc = desc == null ? null : desc.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.user_id
	 * @return  the value of pdf.user_id
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.user_id
	 * @param userId  the value for pdf.user_id
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.post_time
	 * @return  the value of pdf.post_time
	 * @mbg.generated
	 */
	public Date getPostTime() {
		return postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.post_time
	 * @param postTime  the value for pdf.post_time
	 * @mbg.generated
	 */
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.status
	 * @return  the value of pdf.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.status
	 * @param status  the value for pdf.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.nice
	 * @return  the value of pdf.nice
	 * @mbg.generated
	 */
	public Integer getNice() {
		return nice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.nice
	 * @param nice  the value for pdf.nice
	 * @mbg.generated
	 */
	public void setNice(Integer nice) {
		this.nice = nice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pdf.scan
	 * @return  the value of pdf.scan
	 * @mbg.generated
	 */
	public Integer getScan() {
		return scan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pdf.scan
	 * @param scan  the value for pdf.scan
	 * @mbg.generated
	 */
	public void setScan(Integer scan) {
		this.scan = scan;
	}
}