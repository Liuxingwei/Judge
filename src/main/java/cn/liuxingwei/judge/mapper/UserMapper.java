package cn.liuxingwei.judge.mapper;

import cn.liuxingwei.judge.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	User selectByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	List<User> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(User record);
}