package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BankDao;
import pojo.Bank;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDao bankDao;
	
	@Override
	public List<Bank> selectAllBank() {
		List<Bank> bankList = bankDao.selectAllBank();
		return bankList;
	}

}
