package cn.liuxingwei.judge.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user
 */
@Data
@Component
public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_id
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.email
	 * @mbg.generated
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_exp
	 * @mbg.generated
	 */
	private Integer userExp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.submit
	 * @mbg.generated
	 */
	private Integer submit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.solved
	 * @mbg.generated
	 */
	private Integer solved;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.blog_cnt
	 * @mbg.generated
	 */
	private Integer blogCnt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.defunct
	 * @mbg.generated
	 */
	private String defunct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.ip
	 * @mbg.generated
	 */
	private String ip;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.accesstime
	 * @mbg.generated
	 */
	private Date accesstime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.volume
	 * @mbg.generated
	 */
	private Integer volume;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.language
	 * @mbg.generated
	 */
	private Integer language;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbg.generated
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.reg_time
	 * @mbg.generated
	 */
	private Date regTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.nick
	 * @mbg.generated
	 */
	private String nick;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.school
	 * @mbg.generated
	 */
	private String school;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.sign
	 * @mbg.generated
	 */
	private String sign;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_id
	 * @return  the value of user.user_id
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_id
	 * @param userId  the value for user.user_id
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.email
	 * @return  the value of user.email
	 * @mbg.generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.email
	 * @param email  the value for user.email
	 * @mbg.generated
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_exp
	 * @return  the value of user.user_exp
	 * @mbg.generated
	 */
	public Integer getUserExp() {
		return userExp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_exp
	 * @param userExp  the value for user.user_exp
	 * @mbg.generated
	 */
	public void setUserExp(Integer userExp) {
		this.userExp = userExp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.submit
	 * @return  the value of user.submit
	 * @mbg.generated
	 */
	public Integer getSubmit() {
		return submit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.submit
	 * @param submit  the value for user.submit
	 * @mbg.generated
	 */
	public void setSubmit(Integer submit) {
		this.submit = submit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.solved
	 * @return  the value of user.solved
	 * @mbg.generated
	 */
	public Integer getSolved() {
		return solved;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.solved
	 * @param solved  the value for user.solved
	 * @mbg.generated
	 */
	public void setSolved(Integer solved) {
		this.solved = solved;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.blog_cnt
	 * @return  the value of user.blog_cnt
	 * @mbg.generated
	 */
	public Integer getBlogCnt() {
		return blogCnt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.blog_cnt
	 * @param blogCnt  the value for user.blog_cnt
	 * @mbg.generated
	 */
	public void setBlogCnt(Integer blogCnt) {
		this.blogCnt = blogCnt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.defunct
	 * @return  the value of user.defunct
	 * @mbg.generated
	 */
	public String getDefunct() {
		return defunct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.defunct
	 * @param defunct  the value for user.defunct
	 * @mbg.generated
	 */
	public void setDefunct(String defunct) {
		this.defunct = defunct == null ? null : defunct.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.ip
	 * @return  the value of user.ip
	 * @mbg.generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.ip
	 * @param ip  the value for user.ip
	 * @mbg.generated
	 */
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.accesstime
	 * @return  the value of user.accesstime
	 * @mbg.generated
	 */
	public Date getAccesstime() {
		return accesstime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.accesstime
	 * @param accesstime  the value for user.accesstime
	 * @mbg.generated
	 */
	public void setAccesstime(Date accesstime) {
		this.accesstime = accesstime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.volume
	 * @return  the value of user.volume
	 * @mbg.generated
	 */
	public Integer getVolume() {
		return volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.volume
	 * @param volume  the value for user.volume
	 * @mbg.generated
	 */
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.language
	 * @return  the value of user.language
	 * @mbg.generated
	 */
	public Integer getLanguage() {
		return language;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.language
	 * @param language  the value for user.language
	 * @mbg.generated
	 */
	public void setLanguage(Integer language) {
		this.language = language;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbg.generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbg.generated
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.reg_time
	 * @return  the value of user.reg_time
	 * @mbg.generated
	 */
	public Date getRegTime() {
		return regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.reg_time
	 * @param regTime  the value for user.reg_time
	 * @mbg.generated
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.nick
	 * @return  the value of user.nick
	 * @mbg.generated
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.nick
	 * @param nick  the value for user.nick
	 * @mbg.generated
	 */
	public void setNick(String nick) {
		this.nick = nick == null ? null : nick.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.school
	 * @return  the value of user.school
	 * @mbg.generated
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.school
	 * @param school  the value for user.school
	 * @mbg.generated
	 */
	public void setSchool(String school) {
		this.school = school == null ? null : school.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.sign
	 * @return  the value of user.sign
	 * @mbg.generated
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.sign
	 * @param sign  the value for user.sign
	 * @mbg.generated
	 */
	public void setSign(String sign) {
		this.sign = sign == null ? null : sign.trim();
	}
}