package jp.co.internous.ecsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.ecsite.model.domein.MstUser;
import jp.co.internous.ecsite.model.from.LoginForm;

@Mapper
public interface MstUserMapper {

	@Select(value="select * from mst_user where user_name = #{userName}and password = #{password}")
	MstUser findByUserNameAndPassword(LoginForm form);
}





