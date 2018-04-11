package Summer.SpringBoot.mapper;

import Summer.SpringBoot.beans.Users;

public interface UsersMapper {
	public int deleteByPrimaryKey(Integer id);

	public int insert(Users record);

	public int insertSelective(Users record);

	public Users selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(Users record);

	public int updateByPrimaryKey(Users record);
}