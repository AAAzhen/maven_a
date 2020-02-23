package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pojo.Bank;

@Mapper
@Repository
public interface BankDao {

	public List<Bank> selectAllBank();
}
